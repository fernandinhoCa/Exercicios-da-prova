package testeprova;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Fefo
 */
public class exer07aula07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Números:\n");
        
        int vetor[] =new int[3];
        
        for (int linha = 0; linha < 3; linha++) {
            int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o "+(linha+1)+"º número: "));
            vetor[linha]=n1;
            System.out.print(n1+"\t");
        }
     
       
        int maior = vetor[0];
        
        for (int linha = 0; linha < 3; linha++) {
             if(vetor[linha]>maior){
             maior=vetor[linha];
             }       
        }
            
        
         System.out.println("O maior número digitado é o: "+maior);
    }
    
}
