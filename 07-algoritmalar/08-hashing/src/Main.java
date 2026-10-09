import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "algoritma ogrenmek pratik ve sabir ister";
        System.out.println("Harf frekanslari: " + frequencies(text));
        System.out.println("Ilk tekrarsiz karakter: " + firstUniqueCharacter(text));
    }

    static Map<Character, Integer> frequencies(String text) {
        requireText(text);
        Map<Character, Integer> counts = new LinkedHashMap<>();
        for (char character : text.toCharArray()) {
            if (!Character.isWhitespace(character)) {
                counts.merge(character, 1, Integer::sum);
            }
        }
        return counts;
    }

    static Character firstUniqueCharacter(String text) {
        Map<Character, Integer> counts = frequencies(text);
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }

    private static void requireText(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Metin null olamaz.");
        }
    }
}
