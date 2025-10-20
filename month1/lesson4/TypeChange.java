package month1.lesson4;
import java.util.Scanner;
import java.util.Locale;

public class TypeChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Введите дробное число: ");
        double d = scanner.nextDouble();
        int i = (int) d;
        System.out.println("Исходное значение: " + d);
        System.out.println("После преобразования: " + i);
        scanner.close();
    }
}
