interface Informacao {
    static final String exemplo = "Esta mensagem está sendo exibida por meio de uma interface !";

    public void Exibir();
}

class ExemploDeInterface implements Informacao {
    public static void main(String[] args) {
        clearScreen();
        ExemploDeInterface meuExemplo = new ExemploDeInterface();
        meuExemplo.Exibir();
    }

    public void Exibir() {
        System.out.print(exemplo);
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}