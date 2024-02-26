import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println((int) 'A');
        System.out.println((int) 'Z');
        System.out.println((int) 'a');
        System.out.println((int) 'z');
        System.out.println();
        System.out.println((int) 'А');
        System.out.println((int) 'Я');
        System.out.println((int) 'а');
        System.out.println((int) 'я');


        System.out.print("Введите текст для шифрования: ");
        String text = scanner.nextLine();

        System.out.print("Введите величину сдвига: ");
        int number = scanner.nextInt();

        String encryptedText = encrypt(text, number);
        System.out.println("Зашифрованный текст: " + encryptedText);
    }

    public static String encrypt(String text, int number) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                ch = (char) (((ch - base + number) % 26) + base);
            }

            result.append(ch);
        }

        return result.toString();
    }
}
