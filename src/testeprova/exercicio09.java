package testeprova;

import java.util.Scanner;

/**
 *
 * @author Fefo
 */
public class exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor em reais equivalente a um dólar (COTAÇÃO): ");
        double cot = scan.nextDouble();
        
        System.out.println("Digite o valor em reais a ser convertido em dólares: ");
        double valor = scan.nextDouble();
        
        double result = valor/cot;
        
        System.out.println(valor+" equivale a "+result+" dólar (es)");
    }
}
