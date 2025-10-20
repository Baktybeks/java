package month1.lesson4;
import java.util.Scanner;

public class FindAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите число (b): ");
        int b = scanner.nextInt();
        double average = (double) (a + b) / 2;
        System.out.println("Среднее арифметическое: " + average);
        scanner.close();
    }
}
