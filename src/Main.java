import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] nome = new String[10];
        nome[0] = "valdeir";
        nome[1] = "daniel";
        nome[2] = "danilo";
        nome[3] = "saulo";
        nome[4] = "gabriel";
        nome[5] = "ramom";
        nome[6] ="beatriz";
        nome[7] = "raquel";
        nome[8] ="cristina";
        nome[9]= "patricia";
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Nome " +i +":" + nome[i]);

        }

        Scanner LerNome = new Scanner(System.in);
        System.out.println("Qual nome você quer buscar?");
        String NomeBusca = LerNome.nextLine();


        // busca do elemento
        System.out.println("busca linear");
        boolean encontrou = false;
        for (int i = 0; i < nome.length; i++) {
            String elemento = nome[i];
            if (elemento.equalsIgnoreCase(NomeBusca)){
                encontrou = true;
                break;
            }
        }
        if (encontrou == true){
            System.out.println("ENCONTROU");
        }else {
            System.out.println("NÃO ENCONTROU");
        }






    }
}