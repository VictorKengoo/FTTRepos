import java.util.Scanner;

class CalculaTabuada {
    public static void main(String[] args) {
        boolean validou = false;
        double valor = 0;
        Scanner scanner = new Scanner(System.in);

        while (!validou) {
            try {
                clearScreen();
                System.out.println("Eu sei mostrar a tabuada de qualquer número existente, quer experimentar ?");
                System.out.println("Digite um número qualquer: ");
                valor = Double.parseDouble(scanner.nextLine());
                validou = true;
            } catch (NumberFormatException e) {
                System.out.println("Digite apenas números !!");
            }
        }
        for (int n = 1; n < 11; n++) {
            System.out.println(valor * n);
        }

        scanner.close();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}