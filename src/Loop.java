import java.util.Scanner;

public class Loop {
    static void main() {
        Scanner  leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0;i < 3;i++) {
            IO.println("Diga sua nota número "+(i+1)+" para ser calculada!");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        IO.println("A média  das notas é: "+(mediaAvaliacao/3));
    }
}
