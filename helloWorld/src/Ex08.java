import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean fim = true;
        double nota;
        double sum = 0;
        int contador = 0;

        while (fim) {

            System.out.println("Deseja inserir  alguna nota?");
            String sair = scanner.nextLine();

            if (sair.equalsIgnoreCase("sim")) {
                System.out.println("Digite a " + (contador + 1) + " nota");
                nota = scanner.nextDouble();
                sum += nota;
                contador++;
            } else if ((sair.equalsIgnoreCase("nao")) || sair.equalsIgnoreCase("não")) {
                fim = false;
            }

        }
        System.out.printf("A média das %d notas foi de %.2f", contador, (sum / (contador)));

    }

}
