import java.util.Scanner;

public class exercicio2 {
    
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase ou palavra em maiusculo: ");
        String palavra = sc.nextLine();
        System.out.println(new StringBuilder(palavra).reverse().toString());//Inverte a palavra ou a frase
      
        palavra.toLowerCase(); // Esta instrução não altera a palavra digitada.
      
        System.out.println("\nPalavra digitada: " + palavra); // Irá exibir a palavra exatamente como ela foi digitada.
        System.out.println("Palavra alterada: " + palavra.toLowerCase()); // Irá exibir a palavra com todas as letras minúsculas.
    }
}    
        