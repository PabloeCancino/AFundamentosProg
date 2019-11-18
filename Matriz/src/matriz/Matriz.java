package matriz;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        //Crear Matriz
        int matriz[][] = new int[5][5];

        //Dar valor a las matrices
        llenarMatriz(matriz);

        //Imprimir matriz incial
        imprimirMatriz(matriz, "\nMatriz Ingresada");

        //Resolver Matriz inversa
        int matrizInversa[][] = matrizInversa(matriz);

        //Mostrar matriz inversa
        imprimirMatriz(matrizInversa, "\nMatriz Inversa");
    }

    //Metodo LLEMAR Matriz
    public static void llenarMatriz(int matriz[][]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese dato[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    //Creando metodo que imprime la matriz
    public static void imprimirMatriz(int m[][], String mensaje) {
        System.out.println(mensaje);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    //Metodo resuelve la matriz inversa
    public static int[][] matrizInversa(int m[][]) {
        int matriz[][] = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                matriz[i][j] = m[j][i];
            }
        }
        return matriz;
    }
    
    
    
    

}
