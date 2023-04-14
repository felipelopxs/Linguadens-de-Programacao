/*import java.util.ArrayList;*/
import java.util.List;

public class Pedido {
    Massa massa;
    Cliente cliente;
    List<Ingrediente>  listaIngrediente;
    public double calculaValor(){
        double valorInicial = massa.valor;
        int qtdIngrediente = listaIngrediente.size();
        double valorIngredientes = qtdIngrediente * 2;
        double valorFinalPedido = valorIngredientes + valorInicial;
        return valorFinalPedido;
    }
}
