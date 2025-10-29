void main() {
    Scanner addNome = new Scanner(System.in);
    IO.println("Digite o nome de usuário: ");

    String usuarioNome = addNome.nextLine();
    IO.println("Olá, " + usuarioNome);
    IO.println("Top?");
    Soma.Conta();
}
