public class Hamburguer {
    public String nome;
    public Double valor;
    public Boolean artesanal;



    public Hamburguer() {
        this.nome = nome;
        this.valor = valor;
        this.artesanal = artesanal;
    }

    public Double calculaValor(Boolean artesanal){
        if(artesanal){
            return valor + 8.00;
    }
        return valor;
    }
        public String consultaNome() {
            return nome;
        }
}
