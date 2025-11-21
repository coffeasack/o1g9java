import java.text.DecimalFormat;

public class Filme {
    String nome;
    int anoLancamento;
    boolean incluidoPlano;
    double somaTotalAvaliacoes;
    int numeroTotalAvaliacoes;
    int duracaoMinutos;

    void exibirFichaTecnica(){
        IO.println(nome);
        IO.println(anoLancamento);
        IO.println(incluidoPlano);
        IO.println(somaTotalAvaliacoes);
        IO.println(numeroTotalAvaliacoes);
        IO.println(duracaoMinutos);
    }

    void avaliarFilme(double nota){
        somaTotalAvaliacoes += nota;
        numeroTotalAvaliacoes++;
    }

    double retornarMedia() {
        // É possível adicionar outros métodos aqui dentro.
        // É uma forma de instruir um conjunto de ações dentro da sua ação.
        return ((somaTotalAvaliacoes / numeroTotalAvaliacoes)*100/100.0);
    }
}
