
package matrices; 
import java.util.Scanner;

public class Matrices { 

    final static int tamanyo=3;
    public static void main(String[] args) { 
        int[][] matriz=new int[tamanyo][tamanyo];
        rellenarMatriz(matriz);
        mostrarMatriz(matriz);
        diagonalMatriz(matriz);
        diagonalSecundariaDeLosHuevosJoder(matriz);
        esCuadrada(matriz);
        if(esCuadrada(matriz)){
            System.out.println("Es cuadrada");
        }
        else{
            System.out.println("No es cuadrada");
        }
    } 
    
    public static void rellenarMatriz(int[][] m){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.print("Dame un elemento");
                m[i][j]=sc.nextInt();
            }
        }
    }
    public static void mostrarMatriz(int[][] m){
        for(int i=0;i<m.length;i++){
            
        
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j] + " ");
                
            }
            System.out.println("");
        }
    }
    
    public static void diagonalMatriz(int[][] m){
        System.out.println("Diagonal ");
             
        for(int i=0;i<m.length;i++){
            
        
            for(int j=0;j<m[i].length;j++){
                if(i==j){
                    System.out.print(m[i][j] + " ");
                }
            }
            System.out.print(" ");
        }
        System.out.println("");
    }
    public static void diagonalSecundariaDeLosHuevosJoder(int[][] m){
        System.out.println("Diagonal secundaria");
        for(int i=0;i<m.length;i++){
            
        
            for(int j=0;j<m[i].length;j++){
                int valor=i+j;
                if(valor==m.length-1){
                    System.out.print(m[i][j] + " ");
                }
            }
            System.out.print(" ");
        }
    }
    public static boolean esCuadrada(int[][] m){
       return m.length==m[0].length;
    }
    
}