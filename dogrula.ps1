$ErrorActionPreference = 'Stop'

if (-not (Get-Command javac -ErrorAction SilentlyContinue)) {
    throw 'javac bulunamadi. JDK kurulumunu ve PATH ayarini kontrol edin.'
}

$buildRoot = Join-Path ([System.IO.Path]::GetTempPath()) ('java-kurs-dogrulama-' + [guid]::NewGuid().ToString('N'))
New-Item -ItemType Directory -Path $buildRoot | Out-Null

try {
    $projects = Get-ChildItem -Recurse -Directory -Filter src |
        Where-Object { $_.FullName -notmatch '[\\/](build|dist|out)[\\/]' }
    $compiled = 0

    foreach ($sourceDirectory in $projects) {
        $javaFiles = @(Get-ChildItem -LiteralPath $sourceDirectory.FullName -Recurse -File -Filter '*.java')
        if ($javaFiles.Count -eq 0) {
            continue
        }

        $outputDirectory = Join-Path $buildRoot $compiled
        New-Item -ItemType Directory -Path $outputDirectory | Out-Null
        & javac -encoding UTF-8 -d $outputDirectory $javaFiles.FullName
        if ($LASTEXITCODE -ne 0) {
            throw "Derleme basarisiz: $($sourceDirectory.FullName)"
        }
        $compiled++
    }

    Write-Host "Basarili: $compiled kaynak klasoru derlendi."
} finally {
    $resolvedBuildRoot = [System.IO.Path]::GetFullPath($buildRoot)
    $resolvedTempRoot = [System.IO.Path]::GetFullPath([System.IO.Path]::GetTempPath())
    if ($resolvedBuildRoot.StartsWith($resolvedTempRoot, [System.StringComparison]::OrdinalIgnoreCase) -and
            (Split-Path $resolvedBuildRoot -Leaf).StartsWith('java-kurs-dogrulama-')) {
        Remove-Item -LiteralPath $resolvedBuildRoot -Recurse -Force
    }
}

