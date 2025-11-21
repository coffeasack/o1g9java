import java.util.Scanner;

public class ExerciciosPrimeiraAplicacao {
    static void PositivoNegativo() {
        IO.println("Digite um número para saber se é positivo ou não!");
        Scanner scanner = new Scanner(System.in);
        int numeroEscolhido = scanner.nextInt();
        if (numeroEscolhido > 0) {
            IO.println("Número positivo");
        } else if (numeroEscolhido == 0) {
            IO.println("Zero é zero, nada, nil, nothing");
        }
        else {
            IO.println("Número Negativo");
        }
    }

    void igualDiferenteMaiorMenor() {

    }

    void calcularArea() {

    }

    void tabuadaAteDez(){

    }

    void parImpar() {

    }

    void fatorial() {

    }
}
