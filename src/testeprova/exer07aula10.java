package testeprova;

import javax.swing.JOptionPane;

/**
 *
 * @author Fefo
 */
public class exer07aula10 {
    public static void main(String[] args) {
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número: ("
                + "Deve ser maior que o primeiro)"));
        
        int contaImpar = 0;
        int somaImpar = 0;
        
        System.out.println("Número ímpares entre"+n1+" e "+n2);
        
        for (int linha = n1; linha < n2; linha++) {
            if(linha % 2 ==1){
                contaImpar ++;
                somaImpar = somaImpar+ linha;
                System.out.print(linha+ ", ");
            }
            
        }
        double media = somaImpar/contaImpar;
        
        System.out.println("\nMédia: "+media+", \nSoma: "+somaImpar+", \nQuantidade: "+contaImpar);
    }
}
