public class Ex04 {

    public static void main(String[] args) {
        
        boolean trabalhorTerca = false;
        boolean trabalhorQuinta = false;


        if(trabalhorTerca == true && trabalhorQuinta == true){
            System.out.println("Vamos comprar TV de 50' e tomar sorvete no shopping");
        }else if(trabalhorTerca == true || trabalhorQuinta == true){
            System.out.println("Vamos comprar TV de 32' e  tomar sorvete no shopping");
        }else {
            System.out.println("Não foi tomar sorvete");
        }


    }
    
}
