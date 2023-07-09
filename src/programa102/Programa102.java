
package programa102;

import java.util.Scanner;

/**
 *
 * @author Carolina EM
 */
public class Programa102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int matriz1[][],matriz2[][];
        
        matriz1 = new int[5][9];
        matriz2 = new int[9][5];
        
         System.out.println("Digite la matriz:");
        for (int i=0;i<5;i++){
            for (int j=0;j<9;j++){
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz1[i][j] = teclado.nextInt();
            }
        }
        
        System.out.println("\nMatriz original: ");
        for (int i=0;i<5;i++){
            for (int j=0;j<9;j++){
                System.out.print(matriz1[i][j]+" ");
                
            }
            System.out.println("");
    }
        
        // Transponemos 
        for(int i=0;i<5;i++){
            for (int j=0;j<9;j++){
                matriz2[j][i] = matriz1[i][j];
            }
        }
        
        System.out.println("\nLa matriz transpuesta es: ");
        for (int i=0;i<9;i++){
            for(int j=0;j<5;j++){
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
