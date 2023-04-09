public class Data {
    static int dia = 24;
    int mes = 04;
    int ano = 1985;


    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    public Data (int dia, int mes, int ano){
        dia = 01;
        mes = 01;
        ano = 1970;

        System.out.printf("%d/%d/%d", dia, mes, ano);

    }

}
