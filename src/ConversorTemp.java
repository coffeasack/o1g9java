import java.util.Locale;
import java.util.Scanner;

public class ConversorTemp {
    public static void Temperatura() {
        Scanner addTemp = new Scanner(System.in);
        IO.println("Digite a temperatura em Celsius: ");

        double temperaturaCelsius = addTemp.nextDouble();
        double temperaturaFahrenheit = ((temperaturaCelsius * 1.8) + 32);

        int temperaturaFahrenheitInteira = (int) (temperaturaFahrenheit);
        IO.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheitInteira);
    }
}
// O código quebra sempre que o input do usuário contém decimais.
// Procurar por uma forma de receber um float e retornar um int sem quebrar.