public class Ex02 {

    public static void main(String[] args) {

        int a ;
        int b ;

        int numerador;
        int denominador;


        a = (int) Math.pow((6*(3+2)), 2)/ (3*2);

        b = (int) Math.pow(((1-5) * (2 - 7)/2), 2);

        numerador = (int) Math.pow((a-b), 3);

        denominador = (int) Math.pow(10, 3);

        int resultadoFinal = numerador/denominador;


        System.out.println(resultadoFinal);




        
    }
    
}
