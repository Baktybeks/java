package month1.lesson4;
import java.util.Scanner;

public class FirstLastChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = scanner.nextLine();
            char firstChar = text.charAt(0);
            char lastChar = text.charAt(text.length() - 1);
            System.out.println("Первый: " + firstChar);
            System.out.println("Последний: " + lastChar);
      scanner.close();
    }
}
