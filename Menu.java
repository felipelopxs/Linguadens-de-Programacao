import javax.swing.*;


public class Menu {
    public static void main(String[] args){
        Hamburguer h1 = new Hamburguer();
        Pizza p1 = new Pizza();
        int tituloDaTela = Integer.parseInt(JOptionPane.showInputDialog("Faça seu pedido"+"\n 1.Hamburger" +"\n 2.Pizza" + "\n 3.Sair"));
    switch (tituloDaTela){
        case 1:
            h1.nome = JOptionPane.showInputDialog("Insira o nome do seu hamburger :");
            h1.valor = Double.valueOf(JOptionPane.showInputDialog("Insira o valor do seu hamburger: "));
            int artesanal = Integer.parseInt(JOptionPane.showInputDialog("O hamburger é artesanal ? \n 1.Sim \n 2.Não"));

            if(artesanal == 1){
                h1.artesanal = true;
            }
            else
                h1.artesanal = false;
            h1.valor = h1.calculaValor(h1.artesanal);

            JOptionPane.showMessageDialog(null, "O valor do seu pedido é: " + h1.valor);

        case 2:
            p1.nome = JOptionPane.showInputDialog("Insira o nome da sua pizza :");
            p1.valor = Double.valueOf(JOptionPane.showInputDialog("Insira o valor da sua pizza : "));
            int possuiBorda = Integer.parseInt(JOptionPane.showInputDialog("A sua pizza possui borda ? \n 1.Sim \n 2.Não"));
            if(possuiBorda == 1){
                p1.possuiBorda = true;
            }
            else
                p1.possuiBorda = false;
            p1.valor = p1.calcularValor(p1.possuiBorda);
            JOptionPane.showMessageDialog(null, "O valor do seu pedido é: " + p1.valor);

        case 3:
            JOptionPane.showMessageDialog(null, "Obrigado por escolher nosso restaurante!");

    }


    }
}



