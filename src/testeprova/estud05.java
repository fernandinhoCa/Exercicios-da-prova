package testeprova;

import javax.swing.JOptionPane;

/**
 *
 * @author Fefo
 */
public class estud05 {
    public static void main(String[] args) {
        int matriz[][] = new int[5][4];
        int cont = 0;
        
       matriz[0][0] = 2; matriz[0][1] = 90; matriz[0][2] = 232; matriz[0][3] = 677; 
       matriz[1][0] = 34; matriz[1][1] = 89; matriz[1][2] = 344; matriz[1][3] = 543; 
       matriz[2][0] = 23; matriz[2][1] = 56; matriz[2][2] = 788; matriz[2][3] = 67; 
       matriz[3][0] = 0; matriz[3][1] = 2; matriz[3][2] = 243;matriz[3][3] = 212; 
       matriz[4][0] = 28; matriz[4][1] = 56; matriz[4][2] = 456; matriz[4][3] = 34;
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Digite um numero a ser procurado na matriz: "));
        
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
               if(matriz[linha][coluna] == num){
                cont ++;
               }                            
            }           
        }
        
        if(cont > 0){
            System.out.println("A matriz contem o numero digitado!!");
        }
        else{
            System.out.println("A matriz não contem o numero digitado!!");
        }
        
    }
}
