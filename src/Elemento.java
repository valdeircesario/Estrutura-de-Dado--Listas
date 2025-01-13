public class Elemento<e> {
    private e valor;
    private Elemento<e> proximo;

    public Elemento(e novoNome) {
        this.valor = novoNome;

    }

    public e getValor(){
        return valor;
    }
    public void setValor(e valor){
        this.valor = valor;
    }
    public Elemento<e> getProximo(){
        return proximo;
    }
    public void setProximo(Elemento<e> proximo){
        this.proximo = proximo;
    }
}
