public class Task2 {
  public static void main(String[] args)
  {
    byte batteryChargeLevel;
    short numberOfDaysInAYear;
    int numberOfWebsiteUsers;
    long totalNumberOfStarsInTheGalaxy;

    float airTemperature;
    double averageCarSpeed;

    char separatorSymbol;
    boolean lightsOn; //is are has желательно

    String filmTitle;

    batteryChargeLevel = 95;
    numberOfDaysInAYear = 365;
    numberOfWebsiteUsers = 42;
    totalNumberOfStarsInTheGalaxy = 4652745486515L;

    airTemperature = 25.5f; // тут f нужен, чтобы указать что она float
    averageCarSpeed = 156.5; //т.к. все десятичные double, d не написал   

    separatorSymbol = '@';
    lightsOn = false;

    filmTitle = "Матрица";

    System.out.println("Уровень заряда батареи: " + batteryChargeLevel);
    System.out.println("Количество дней в году: " + numberOfDaysInAYear);
    System.out.println("Число пользователей сайта: " + numberOfWebsiteUsers);
    System.out.println("Общее количество звезд в галактике: " + totalNumberOfStarsInTheGalaxy);
    System.out.println("Температура воздуха: " + airTemperature);
    System.out.println("Средняя скорость автомобиля: " + averageCarSpeed);
    System.out.println("Символ разделителя: " + separatorSymbol);
    System.out.println("Свет включен: " + lightsOn);
    System.out.println("Название фильма: " + filmTitle);
  }
}