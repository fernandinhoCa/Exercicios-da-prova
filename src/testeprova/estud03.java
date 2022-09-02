package testeprova;

import javax.swing.JOptionPane;

/**
 *
 * @author Fefo
 */
public class estud03 {
    public static void main(String[] args) {
        int vetor[] = new int[5];
        
        for (int linha = 0; linha < 5; linha++) {
            int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o "+(linha+1)+"º número: "));
            vetor[linha] = n;
        }
        
        System.out.println("Os números digitados foram: ");
        for (int linha = 0; linha < 5; linha++) {
            System.out.print(vetor[linha]+", ");
        }
        
        System.out.println("\nOs números digitaods, multiplicaods por 3 são: ");
        for (int linha = 0; linha < 5; linha++) {
            System.out.print((vetor[linha]*3)+", ");
        }
    }
}
