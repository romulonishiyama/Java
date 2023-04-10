public class Pessoa {

    String nome;
    double peso;

    Pessoa (String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }


    void comer(Comida comida){
        if(comida != null){
            this.peso += comida.peso;
        }
    }

  
    




}
