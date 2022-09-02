package testeprova;

import javax.swing.JOptionPane;

/**
 *
 * @author Fefo
 */
public class estud02 {
    public static void main(String[] args) {
        String vetor[] = new String[10];
        
        for (int linha = 0; linha < 10; linha++) {
          String nome = JOptionPane.showInputDialog(null, "Digite o "+(linha+1)+"º nome: ");
          vetor[linha] = nome;
        }
        
        System.out.println("Os nomes digitados foram: ");
        for (int linha = 0; linha < 10; linha++) {
            System.out.print(vetor[linha]+", ");           
        }
        
        System.out.println("");
        System.out.println("Os nomes digitados na ordem inversa ficam: ");
        for (int linha = 9; linha >= 0; linha--) {
            System.out.print(vetor[linha]+", ");           
        }
    }
}
