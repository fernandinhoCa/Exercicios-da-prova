package testeprova;

import javax.swing.JOptionPane;

/**
 *
 * @author Fefo
 */
public class exer01aula08 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número interi positivo: "));
        
        int acum =2;
        System.out.println("Os "+n+" primeiros números pares são: ");
        for (int linha = 1; linha <= n; linha++) {
            System.out.print(acum+", ");
            
            acum = acum +2;
            
        }
    }
}
