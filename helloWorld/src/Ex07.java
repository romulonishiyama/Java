import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o dia da semana");
        String diaSemana = entrada.nextLine();

        if(diaSemana.equalsIgnoreCase("domingo")){
            System.out.println("1");
        }else if(diaSemana.equalsIgnoreCase("Segunda")){
            System.out.println("2");
        }

        entrada.close();





        
    }
    
}
