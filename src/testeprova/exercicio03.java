package testeprova;

import java.util.Scanner;

/**
 *
 * @author Fefo
 */
public class exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        
        
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        
        int vetor[] = new int[8];
       
        for (int linha = 0; linha < 8; linha++) {
            System.out.println("Digite o "+(linha+1)+"º número: ");
            vetor[linha] = scan.nextInt();
            
            if (vetor[linha] >= 0 && vetor[linha] <= 50) {
                cont1 = cont1 + 1;               
            }
            if(vetor[linha] >= 51 && vetor[linha] <= 100) {
                cont2 = cont2 + 1;               
            }
            if (vetor[linha] >100) {
                cont3 = cont3 + 1;               
            }
        }
        
        System.out.println("Total de números digitados entre 0 e 50: "+cont1);
        System.out.println("Total de números digitados entre 51 e 100: "+cont2);
        System.out.println("Total de números digitados maiores que 100: "+cont3);
    }
}
