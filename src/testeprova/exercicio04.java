
package testeprova;

import java.util.Scanner;

/**
 *
 * @author Fefo
 */
public class exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                
        int vetorPar[] = new int[7];
        int vetorImpar[] = new int[7];
        
        
       for(int linha = 0; linha < 7;) {
            System.out.println("Digite o "+(linha +1)+"º número par (apenas pares ex.: 2, 46, 90, etc): ");
            int par = scan.nextInt();
            
            if (par == 0){
                System.out.println("Valor inválido, digite outro diferente de zero (0)");
            }
            else{
            vetorPar[linha] = scan .nextInt();
            linha = linha+1;
            }
        }
        
        for(int linha = 0; linha < 7;) {
            System.out.println("Digite o "+(linha +1)+"º número impar (apenas ímpares ex.: 9, 47, 97, etc): ");
            int impar = scan.nextInt();
            
            if (impar == 0){
                System.out.println("Valor inválido, digite outro diferente de zero (0)");
            }
            else{
            vetorImpar[linha] = scan .nextInt();
            linha = linha+1;
            }
        }
        System.out.println("Os números pares digitados são: ");
        for (int linha = 0; linha < 7; linha++) {
            System.out.println(vetorPar[linha]+", ");           
        }
        
        System.out.println("Os números ímpares digitados são: ");
        for (int linha = 0; linha < 7; linha++) {
            System.out.println(vetorImpar[linha]+", ");
        }
    }
}
