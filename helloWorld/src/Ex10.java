import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        while (flag) {
            System.out.println("Digite um numero entre (1 - 10)");
            int numero = scanner.nextInt();

            if (numero > 10 || numero < 0) {
                System.out.println("Numero invalido, digite novamente");
            } else {
                System.out.println(numero % 2 == 0 ? "Par" : "Impar");
                flag = false;
            }

        }

    }

}
