package month1.lesson4;
import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();
        int length = text.length();
        System.out.println("Количество символов: " + length);
        scanner.close();
    }
}
