package month1.lesson4;
import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = scanner.nextLine();
        System.out.print("Введите индекс: ");
        int index = scanner.nextInt();
        char ch = text.charAt(index);
        System.out.println("Символ: " + ch);
        scanner.close();
    }
}
