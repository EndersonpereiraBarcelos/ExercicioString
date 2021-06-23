import java.util.Scanner;

public class exercicio5{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra ");
        String palavra = sc.nextLine();

        String[] myPhrase = palavra.toUpperCase().split("");

        for(int i=myPhrase.length; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print(myPhrase[j]);
            }
            System.out.println();
        }


    }
}