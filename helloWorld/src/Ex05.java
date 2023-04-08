import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        int num1;
        int num2;
        String operacao;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        num1 = scanner.nextInt();
        System.out.println("Digite outro numero");
        num2 = scanner.nextInt();

        System.out.println("Qual operação que realizar (+, -, *, /)");
        operacao = scanner.next();

        switch (operacao) {

            case "+":
                System.out.println("A soma dos numeros " + num1 + " + " + num2 + " é " + num1 + num2);
                break;

            case "-":
                System.out.println("A subtração dos numeros " + num1 + " - " + num2 + " é " + (num1 - num2));
                break;

            case "*":

                System.out.println("A multiplicação dos numeros " + num1 + " * " + num2 + " é " + num1 * num2);
                break;

            case "/":
                System.out.println("A divisão dos numeros " + num1 + " / " + num2 + " é " + num1 / num2);
                break;

            default:
                System.out.println("Comando invalido!");
                break;

        }

        System.out.println("Fim");
    }

}
