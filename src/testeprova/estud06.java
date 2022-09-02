package testeprova;

import javax.swing.JOptionPane;

/**
 *
 * @author Fefo
 */
public class estud06 {
    public static void main(String[] args) {
        int matriz[][] = new int[8][4];
        
        System.out.println("Matriz:");
        
        for (int linha = 0; linha < 8; linha++) {
            System.out.println("");
            for (int coluna = 0; coluna < 4; coluna++) {
                int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite "
                        + "o ["+linha+","+coluna+"]: "));
                matriz[linha][coluna] = num;
                System.out.print(matriz[linha][coluna]+"\t");
            }
        }
        
        int menor = matriz[0][0];
        
        for (int linha = 0; linha < 8; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                if(matriz[linha][coluna]<menor){
                menor = matriz[linha][coluna];
                }
            }
            
        }
        
        int maior = matriz[0][0];
        
        for (int linha = 0; linha < 8; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                if(matriz[linha][coluna]>maior){
                maior = matriz[linha][coluna];
                }
            }
            
        }
        
        System.out.println("maior: "+maior+"\nmenor: "+menor);
    }
}
