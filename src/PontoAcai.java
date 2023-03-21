import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;

public class PontoAcai {

    public static void main(String[] args) {
        int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha o tamanho do açai desejado: \n 1. 300 \n 2. 500 \n 3. 700"));
        boolean adicional = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Vai ter adicional de sorvete ?: ","", JOptionPane.QUESTION_MESSAGE ));

        Acai pedido = new Acai();

        switch (menu) {
            case 1:
                pedido.tamanho = 300;
                break;
            case 2:
                pedido.tamanho = 500;
                break;
            case 3:
                pedido.tamanho = 700;
                break;
        }
        pedido.adicional = adicional;

        JOptionPane.showMessageDialog(null, "O valor do pedido ficou: " + pedido.valorAcai());
    }
}
