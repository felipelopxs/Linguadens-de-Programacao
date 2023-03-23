package br.com.newton.exercicioacai;
import javax.swing.JOptionPane;

public class PontoAcai {
    public static void main(String[] args) {
        Acai p1 = new Acai();
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Qual tamano de Açaí deseja\n<1> Tamanho = 300ml => valor 8,00\n<2> Tamanho = 500ml => valor 10,00\n<3> Tamanho = 700ml => valor 12,00\n<4> SAIR!\nDigite o número do tamanho desejado: "));

            switch (opcao) {
                case 1:
                    p1.setValor(8);
                    int opcao2 = Integer.parseInt(JOptionPane.showInputDialog("Deseja acrescentar sorvete:\n1 - Sim\n2 - Não"));
                    switch (opcao2) {
                        case 1:
                            p1.setPossuiAcrescimo(true);
                            break;
                        case 2:
                            p1.setPossuiAcrescimo(false);
                            break;
                    }
                    JOptionPane.showMessageDialog(null, "Valor total do Pedido: " + p1.Calculavalor(p1.isPossuiAcrescimo()), "OBRIGADO POR COMPRAR CONOSCO", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    p1.setValor(10);
                    opcao2 = Integer.parseInt(JOptionPane.showInputDialog("Deseja acrescentar sorvete:\n1 - Sim\n2 - Não"));
                    switch (opcao2) {
                        case 1:
                            p1.setPossuiAcrescimo(true);
                            break;
                        case 2:
                            p1.setPossuiAcrescimo(false);
                            break;
                    }
                    JOptionPane.showMessageDialog(null, "Valor total do Pedido: " + p1.Calculavalor(p1.isPossuiAcrescimo()), "OBRIGADO POR COMPRAR CONOSCO", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    p1.setValor(12);
                    opcao2 = Integer.parseInt(JOptionPane.showInputDialog("Deseja acrescentar sorvete:\n1 - Sim\n2 - Não"));
                    switch (opcao2) {
                        case 1:
                            p1.setPossuiAcrescimo(true);
                            break;
                        case 2:
                            p1.setPossuiAcrescimo(false);
                            break;
                    }
                    JOptionPane.showMessageDialog(null, "Valor total do Pedido: " + p1.Calculavalor(p1.isPossuiAcrescimo()), "OBRIGADO POR COMPRAR CONOSCO", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"OBRIGADO","VOLTE SEMPRE!",JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Entre com opção válida", "ERRO!", JOptionPane.ERROR_MESSAGE);

            }
        }while (opcao != 4);
    }
}
