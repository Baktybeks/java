package month1.lesson4;
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        int square = n * n;
        int cube = n * n * n;
        System.out.println("Квадрат: " + square);
        System.out.println("Куб: " + cube);
        scanner.close();
    }
}
