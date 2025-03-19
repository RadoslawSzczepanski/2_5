
public class Main {
  public static void main(String[] args) {
    System.out.println("Celsius\tFahrenheit");
    System.out.println("-------------------");
    
    for (int celsius = 0; celsius <= 300; celsius += 20) {
      double fahrenheit = (celsius * 9.0/5.0) + 32;
      System.out.printf("%3d°C\t%6.1f°F%n", celsius, fahrenheit);
    }
  }
}
