public class Programa {
    public static void main(String[] args) {
        ListaLigada<String> lista = new ListaLigada<String>();
        System.out.println("tamanho da lista "+"= "
                +lista.getTamanho());
        // adcionar nome na lista
        lista.adcionar("valdeir");
        lista.adcionar("cristina");
        lista.adcionar("paulo");
        System.out.println("tamanho :"+ lista.getTamanho());
        System.out.println("primeiro :"+lista.getPrimriro().getValor());
        System.out.println("ultimao :"+lista.getUltimo().getValor());

        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
            
        }
        
        //lista de remoção
        lista.remover("cristina");
        System.out.println("Removido: cristina");
        lista.remover("valdeir");
        System.out.println("Removido: valdeir");
//        lista.remover("paulo");



        if (lista.getTamanho() > 0) {
            for (int i = 0; i < lista.getTamanho(); i++) {
                System.out.println("itens da list");
                System.out.println(lista.get(i).getValor());
            }
        } else {
            System.out.println("A lista está vazia.");
        }

        }
        
        


}
