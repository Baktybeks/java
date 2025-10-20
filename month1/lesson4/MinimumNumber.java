package month1.lesson4;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();
        if (a < b) {
            System.out.println("Меньшее число: " + a);
        } else if (b < a) {
            System.out.println("Меньшее число: " + b);
        } else {
            System.out.println("Числа равны.");
        }
        scanner.close();
    }
}