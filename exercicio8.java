import java.util.Scanner;

public class exercicio8{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase");
        String frase = sc.nextLine();

        frase = frase.replaceAll("[ .]","");

        StringBuilder fraseReversaB = new StringBuilder();
        fraseReversaB.append(frase).reverse();
        fraseReversaB.reverse();
        String fraseReversa = String.valueOf(fraseReversaB);

        System.out.println(frase);
        System.out.println(fraseReversaB);

        if(frase.length() == fraseReversa.length()) {
            System.out.print("Palavra ");
        }else {
            System.out.print("Frase ");
        }
        if(frase.equals(fraseReversa)){
            System.out.print("Digitada é um palindromo ");
        }else{
            System.out.print("Digitada NÃO é um palindromo ");
        }     
    }
}