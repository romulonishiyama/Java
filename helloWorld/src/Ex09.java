public class Ex09 {

    public static void main(String[] args) {

        String nome = "romul";
        String nome2 = "";
        String cerquilha = "#";

        int tamanho = nome.length();

        for (; tamanho > nome2.length(); tamanho--){
            System.out.println(cerquilha);
            cerquilha += "#";

        }

        for (String v = "*"; !v.equals("*******") ; v += "*"){
            System.out.println(v);
        }
        

    }
    
}
