import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversorDollar{
    public static void Cambio() {
        double valorReal = 4.94;

        Scanner addValorDollar = new Scanner(System.in);
        IO.println("Digite quantos dólares você possui: ");

        double valorDollar = addValorDollar.nextDouble();
        double valorDollarparaReal = valorDollar * valorReal;
        DecimalFormat formatacao = new DecimalFormat("#.##");

        IO.println("A conversão de $"+valorDollar+" para reais será R$"+formatacao.format(valorDollarparaReal));
    }
}
