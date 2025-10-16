public class RectangleArea {
  public static void main(String[] args) {
    final int CM_IN_METER = 100;

    double lengthCm = 250;
    double widthCm = 150;

    double lengthM = lengthCm / CM_IN_METER;
    double widthM = widthCm / CM_IN_METER;

    double area = lengthM * widthM;

    System.out.println("Длина: " + lengthM + " м");
    System.out.println("Ширина: " + widthM + " м");
    System.out.println("Площадь прямоугольника: " + area + " м2");
  }
}
