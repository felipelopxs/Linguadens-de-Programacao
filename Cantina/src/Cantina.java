import javax.swing.JOptionPane;

public class Cantina {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente :");
        String tipoMassa = JOptionPane.showInputDialog("Digite o tipo da massa :");
        Double valorMassa = Double.valueOf(JOptionPane.showInputDialog("Informe o valor da massa :"));
    }

}
