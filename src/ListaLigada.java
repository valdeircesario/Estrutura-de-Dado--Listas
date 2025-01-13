public class ListaLigada <e> {
    private  Elemento<e> primriro;
    private Elemento<e> ultimo;
    private int tamanho;

    public ListaLigada(){
        this.tamanho = 0;

    }

    public Elemento<e> getPrimriro() {
        return primriro;
    }

    public void setPrimriro(Elemento<e> primriro) {
        this.primriro = primriro;
    }

    public Elemento<e> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Elemento<e> ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adcionar(e novoNome){
        Elemento<e> novoElemento =  new Elemento<e>(novoNome);
        if (this.primriro == null && this.ultimo == null){
            this.primriro = novoElemento;
            this.ultimo = novoElemento;
        }else {
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        this.tamanho++;

    }
    public void remover(e nomeProcurado){
        Elemento<e> anterior = null;
        Elemento<e> atual = this.primriro;
        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getValor().equals(nomeProcurado)){
                if (this.tamanho == 1){
                    this.primriro = null;
                    this.ultimo = null;
                }else if (atual == primriro){
                    this.primriro = atual.getProximo();
                    atual.setProximo(null);
                }else if (atual == ultimo){
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                }else{
                    anterior.setProximo(atual.getProximo());
                    atual = null;

                }
                this.tamanho--;
                break;

            }
            anterior =atual;
            atual = atual.getProximo();


        }


    }
    public Elemento get(int posicao){
        Elemento atual = this.primriro;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null){
                atual = atual.getProximo();

            }

        }
        return atual;
    }
}
