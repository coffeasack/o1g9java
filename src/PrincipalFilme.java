public class PrincipalFilme {
    static void main() {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Up! Altas Aventuras";
        meuFilme.anoLancamento = 2008;
        meuFilme.duracaoMinutos = 180;
        meuFilme.incluidoPlano = true;

        meuFilme.avaliarFilme(8);
        meuFilme.avaliarFilme(3);
        meuFilme.avaliarFilme(4);
        meuFilme.avaliarFilme(7);
        meuFilme.avaliarFilme(2);
        meuFilme.avaliarFilme(9);

        IO.println(meuFilme.retornarMedia());
    }
}
