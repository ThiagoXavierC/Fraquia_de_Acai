public class Acai {

    public Integer tamanho;
    public Double valor;
    public boolean adicional;


    public Double valorAcai() {
        if (tamanho == 300) {
            valor = 8.0;
        } else if (tamanho == 500) {
            valor = 10.0;
        } else if (tamanho == 700) {
            valor = 12.0;
        }
        if (adicional) {
            valor += 2.0;
        }

            return valor;
    }
}


