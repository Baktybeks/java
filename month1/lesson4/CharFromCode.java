package month1.lesson4;
import java.util.Scanner;

public class CharFromCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числовой код символа: ");
        int code = scanner.nextInt();
        char symbol = (char) code;
        System.out.println("Символ: " + symbol);
        scanner.close();
    }
}
