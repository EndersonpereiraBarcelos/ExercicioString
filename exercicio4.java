import java.util.Scanner;

public class exercicio4{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String palavra = sc.nextLine();

        String[] myPhrase = palavra.toUpperCase().split("");

        for (int i=0; i<myPhrase.length; i++){
            for (int j=0; j<(i+1); j++){
                System.out.print(myPhrase[j]);
            }
            System.out.println();
        }
    }
}