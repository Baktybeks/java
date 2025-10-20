package month1.lesson4;
import java.util.Scanner;

public class ReplaceSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String result = scanner.nextLine().replace(" ", "_");
        System.out.println("Результат: " + result);
        scanner.close();
    }
}
