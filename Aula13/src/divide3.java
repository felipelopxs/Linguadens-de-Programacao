import javax.swing.*;

public class divide3 {
    public static void main(String[] args) {
        int dividendo, divisor,divide;
        while (true){
            try {
                dividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite o dividendo: "));
                divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor: "));
                divide(dividendo,divisor);
                break;
            }
            catch(ArithmeticException e1){
                JOptionPane.showMessageDialog(null,"Não pode dividir por zero!");
            }
            catch (NumberFormatException e2){
                JOptionPane.showMessageDialog(null, "Favor informar apenas numeros inteiros!");
            }
        }
    }
    public static void  divide(int dividendo, int divisor){
        System.out.println("Divisão = " + (dividendo/divisor));
    }
}
