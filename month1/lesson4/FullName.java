package month1.lesson4;
import java.util.Scanner;
public class FullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String firstName = scanner.nextLine();
        System.out.print("Введите фамилию: ");
        String lastName = scanner.nextLine();
        String fullName = lastName + " " + firstName;
        System.out.println("Полное имя: " + fullName);
        scanner.close();
    }
}
