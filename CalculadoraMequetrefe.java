import java.util.Scanner;

public class CalculadoraMequetrefe {
    public static void main(String[] args) {
        int operacao = 0;
        double primNum = 0;
        double segNum = 0;
        boolean validou = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Esta é a Calculadora Mequetrefe \n");

        try {
            System.out.println("Digite um número: ");
            primNum = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Digite apenas números");
        }

        clearScreen();
        System.out.println("Primeiro número: " + primNum);
        System.out.println("Escolha uma operação: \n 1) +\n 2) -\n 3) /\n 4) *\n 5) x^");

        while (ValidaOperacao(operacao) == false) {
            try {
                operacao = Integer.parseInt(scanner.nextLine());
                if (operacao < 1 || operacao > 6) {
                    throw new NumberFormatException();
                }

            } catch (NumberFormatException e) {
                System.out.println("Digite apenas os números correspondentes de cada operação: ");
            }
        }

        while (!validou) {
            try {
                System.out.println("\nAgora digite o segundo número");
                segNum = Double.parseDouble(scanner.nextLine());
                validou = true;
            } catch (NumberFormatException e) {
                System.out.println("Digite apenas números");
            }
        }

        switch (operacao) {
            case 1:
                System.out.println(primNum + segNum);
                break;
            case 2:
                System.out.println(primNum - segNum);
                break;
            case 3:
                System.out.println(primNum / segNum);
                break;
            case 4:
                System.out.println(primNum * segNum);
                break;
            case 5:
                System.out.println(Math.pow(primNum, segNum));
                break;
            default:
                System.out.println("\n Digite uma operação válida");
        }
        scanner.close();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static boolean ValidaOperacao(Integer operation) {
        if (operation != 1 && operation != 2 && operation != 3 && operation != 4 && operation != 5) {
            return false;
        } else
            return true;
    }
}
