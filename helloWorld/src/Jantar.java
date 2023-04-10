public class Jantar {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Romulo", 88);
        Comida comida1 = new Comida("feijao", 0.300);

        System.out.println(p1.getNome());
        System.out.println(p1.getPeso());

        p1.comer(comida1);

        System.out.println(p1.getNome());
        System.out.println(p1.getPeso());
        p1.comer(comida1);
        System.out.println(p1.getNome());
        System.out.println(p1.getPeso());

        
      
        
    }
    
}
