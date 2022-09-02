
package testeprova;

import javax.swing.JOptionPane;

/**
 *
 * @author Fefo
 */
public class estud01 {
    public static void main(String[] args) {
        int vetor[] = new int[8];
        int total = 0;
        
        for (int linha = 0; linha < 8; linha++) {
           int n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                   "Digite o "+(linha+1)+"º número do tipo inteiro: "));
            vetor[linha] = n;
            total = total+n;
        }
        System.out.println("A soma dos números digitados é: "+total); 
        System.out.println("Os números digitados foram: ");
        
        for (int linha = 0; linha < 8; linha++) {
            System.out.print(vetor[linha]+", ");
            
        }
    }        
}
