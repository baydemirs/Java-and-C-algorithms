# Java Öğrenme Arşivi

Bu depo, birinci sınıfta yazdığım Java çalışmalarını ve sonradan eklediğim sıralı algoritma örneklerini içerir. Eski çalışmalar, gelişim sürecini göstermek amacıyla korunmuştur. Yeni algoritma bölümü ise konuları birbirinin üzerine inşa olacak sırada sunar.

## Öğrenme sırası

1. `01-java-temelleri`: koşullar, döngüler, kullanıcı girdisi ve temel problemler
2. `02-diziler-ve-matrisler`: diziler, matrisler ve flood-fill
3. `03-metotlar-ve-hata-yonetimi`: metotlar, overloading ve exception yapısı
4. `04-nesne-yonelimli-programlama`: sınıflar, encapsulation, kalıtım ve interface
5. `05-swing-uygulamalari`: masaüstü arayüz örnekleri
6. `06-mini-oyunlar`: Candy Crush flood-fill ve Flappy Bird
7. `07-algoritmalar`: sıralı veri yapıları ve algoritma müfredatı

Algoritma bölümünün ayrıntılı sırası için [algoritma yol haritasına](07-algoritmalar/README.md) bakın.

## Çalıştırma

Algoritma örneklerinin her biri bağımsızdır. İlgili konu klasöründe:

```powershell
javac -encoding UTF-8 -d out src\Main.java
java -cp out Main
```

Depodaki bütün Java kaynaklarını izole biçimde derlemek için:

```powershell
.\dogrula.ps1
```

Eski uygulamalar NetBeans Ant projeleridir. Projeler Java 21 ve UTF-8 yapılandırmasına sahiptir.

