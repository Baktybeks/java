package month1.lesson4;
import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String text = scanner.nextLine();
        String upper = text.toUpperCase();
        String lower = text.toLowerCase();
        System.out.println("В верхнем регистре: " + upper);
        System.out.println("В нижнем регистре: " + lower);
        scanner.close();
    }
}
