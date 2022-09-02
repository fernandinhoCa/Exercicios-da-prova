package testeprova;

import javax.swing.JOptionPane;

/**
 *
 * @author Fefo
 */
public class estud04 {
    public static void main(String[] args) {
        int matriz[][] =  new int[4][4];
        int soma = 0;
        
        System.out.println("Matriz:");
        for (int linha = 0; linha < 4; linha++) {
            System.out.println("");
            for (int coluna = 0; coluna < 4; coluna++) {
                int num = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "Digite o número["+linha+","+coluna+"]: "));
                matriz[linha][coluna] = num;                
                System.out.print(num+ "\t");
                soma = soma + num;
                
                if(coluna ==3){
                    System.out.println("A soma da linha "+(linha+1)+" é: "+soma);
                soma = 0;
                }
            }
            
        }
        
    }
}
