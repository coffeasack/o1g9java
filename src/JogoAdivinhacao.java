import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    static void main() {
         // 1. O usuário vai iniciar o jogo e um número aleatório será gerado
         // 2. O usuário terá 5 tentativas para acertar o número
         // 3. Cada tentativa dirá se o número é maior ou menor
         // 4. Caso o jogador erre as 5 tentativas, o jogo dirá qual era o número e finalizará.
         // 5. Caso o jogador acerte, o programa dirá parabéns.
         // 6. Caso ele queira encerrar a atividade, deverá digitar -1.
        int numeroAleatorio = new Random().nextInt(0,100);
        IO.println("""
                            O número secreto foi sorteado! Digite um número para tentar descobrí-lo.
                            Você possui 5 tentativas, então faça valer! 
                            (Digite -1 caso queira finalizar o jogo)
                        """);
        IO.println("Iniciando... Vai!");
            for (int tentativaJogada = 5; tentativaJogada >= 0; tentativaJogada--) {
                Scanner tentativa = new Scanner(System.in);
                int numeroJogador = tentativa.nextInt();
                if (numeroJogador == numeroAleatorio) {
                    IO.println("Parabéns! Você acertou em cheio!");
                    break;
                }
                else {
                    if (numeroJogador > numeroAleatorio) {
                        IO.println("O número sorteado é menor que o número digitado! Tente novamente! Você possui mais "+(tentativaJogada-1)+" tentativa(s)!");
                    }
                    else {
                        IO.println("O número sorteado é maior que o número digitado! Tente novamente! Você possui mais "+(tentativaJogada-1)+" tentativa(s)!");
                    }
                }
            }
        IO.println(numeroAleatorio);
    }
}
