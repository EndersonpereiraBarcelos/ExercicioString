import java.util.Scanner;

public class exercicio3 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe palavra ou frase para ser escrita na vertical: ");
        String mensagem = sc.nextLine();

        String[] result = mensagem.split("");

        for(String s : result){
            System.out.println(""+s+"");
        
        }
    }       
}    