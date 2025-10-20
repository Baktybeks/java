package month1.lesson4;

import java.util.Scanner;

public class Lesson4 {
  public static void main(String[] args) {
    // double d = 2.0 - 1.1 ;
    // System.out.println(d);

    Scanner scanner = new Scanner(System.in);
    // System.out.print("Введите первое число: ");
    // int a = scanner.nextInt();
    // System.out.print("Введите второе число: ");
    // int b = scanner.nextInt();

    // System.out.printf("Сумма: %d\nРазность: %d", a+b, a-b);

    // System.err.print("Введите число в диапазоне 10 - 20: ");

    // float a = scanner.nextFloat();

    // boolean result = 10<= a && a <=20;

    // System.out.printf("Входит в диапазон: %b", result);

    System.out.print("Введите год: ");
    int year = scanner.nextInt();

    boolean result = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    System.err.printf("Год  високосный %b", result);
  }
}
