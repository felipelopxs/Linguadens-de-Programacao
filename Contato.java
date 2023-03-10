package br.com.newton.agenda;

public class Contato {
    private String nome;
    private String numero;

    public void Excluir(Contato contato){
        System.out.println("Você está excluindo o contato :" + contato.nome);
    }
    public void add(String contato){
        System.out.println("Você está adicionando o contato :" + nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}