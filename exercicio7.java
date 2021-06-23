import java.util.Scanner;

public class exercicio7 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase");
        String digiteFrase = sc.nextLine();
        String[] digiteSplit = digiteFrase.split("");

        int vogais = 0,
            espaçoVazio = 0;

            String[] letrasVogais = {"a", "e", "i", "o", "u"};
            for(int i=0; i<digiteSplit.length; i++){
                if(digiteSplit[i].equalsIgnoreCase(" ")){
                    espaçoVazio ++;
                }
                for(int j=0; j<letrasVogais.length; j++){
                    if(digiteSplit[i].equalsIgnoreCase(letrasVogais[j])){
                        vogais++;
                    }
                }
            }
            System.out.printf("Espaços em branco existente na frase: %d%n", espaçoVazio);
            System.out.printf("vogais existente na frase: %d", vogais);


    }
}
