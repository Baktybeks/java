package month1.lesson4;
import java.util.Scanner;
public class LastNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите целое число: ");
    int number = scanner.nextInt();
    int lastNumber = number % 10;
    System.out.println("Последняя цифра: " + lastNumber);
    scanner.close();  
  }
}