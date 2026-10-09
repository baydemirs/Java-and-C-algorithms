import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        System.out.println("Parantezler dengeli mi: " + isBalanced("{[()()]}") );

        Deque<String> tasks = new ArrayDeque<>();
        tasks.addLast("Dosyayi oku");
        tasks.addLast("Veriyi isle");
        tasks.addLast("Sonucu yaz");
        while (!tasks.isEmpty()) {
            System.out.println("Islenen gorev: " + tasks.removeFirst());
        }
    }

    static boolean isBalanced(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Metin null olamaz.");
        }
        Deque<Character> stack = new ArrayDeque<>();
        for (char character : text.toCharArray()) {
            if (character == '(' || character == '[' || character == '{') {
                stack.push(character);
            } else if (character == ')' || character == ']' || character == '}') {
                if (stack.isEmpty() || !matches(stack.pop(), character)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '[' && close == ']')
                || (open == '{' && close == '}');
    }
}

