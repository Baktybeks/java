package month1.lesson4;
import java.util.Scanner;
public class DeleteInt {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите число (b): ");
        int b = scanner.nextInt();
        int intResult = a / b;      
        double doubleResult = (double) a / b;
        System.out.println("Результат целочисленного деления: " + intResult);
        System.out.println("Результат точного деления: " + doubleResult);
        scanner.close();
    }
}
