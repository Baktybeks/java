package month1.lesson6;

import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
        System.out.print("a=");
        int a = scanner.nextInt();
        System.out.print("b=");
        int b = scanner.nextInt();

//        float aa = 500.0f;
//        float bb = 230.0f;

//        if (number1 > number2) {
//            System.out.println("Hello");
//        } else {
//            System.out.println("Bye");
//        }

//        int result = a < b ? (a*b) : (a/b);
//        System.out.println(result);
//        System.out.print("Enter=");
//        float amount = scanner.nextFloat();
//        if (aa>=amount) {
//            aa=aa-amount;
//            bb=bb+amount;
//        }
//        System.out.printf("aa=%.2f, bb=%.2f,", aa,bb);
        int result = 1;
        int sum = 0;

        for (int i = 0; i < b; i++) {
            result *= a;
            sum += i;
        }
        System.out.printf("sum=%d\n", sum);
        System.out.printf("result=%d", result);
    }
}
