
public class Main {
  public static void main(String[] args) {
    System.out.println("Celsjusz Fahrenheit");
    System.out.println(" ");
    
    for (int celsiusz = 0; celsiusz <= 300; celsiusz += 20) {
      double fahrenheit = (celsiusz * 9.0/5.0) + 32;
      System.out.printf("%3d°C\t%6.1f°F%n", celsiusz, fahrenheit);
    }
  }
}
