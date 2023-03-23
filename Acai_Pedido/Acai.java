
package br.com.newton.exercicioacai;

public class Acai {
    private int tamanho;
    private double valor;
    private boolean possuiAcrescimo;

    public Acai() {
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isPossuiAcrescimo() {
        return possuiAcrescimo;
    }

    public void setPossuiAcrescimo(boolean possuiAcrescimo) {
        this.possuiAcrescimo = possuiAcrescimo;
    }

    public Double Calculavalor(boolean possuiAcrescimo){
        if(possuiAcrescimo){
            double valor = getValor()+2;
            setValor(valor);
        }
        return this.valor;
    }
}
