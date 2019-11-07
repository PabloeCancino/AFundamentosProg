/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.matrices;

import java.util.Scanner;

/**
 *
 * @author Laboratorio 7
 */
public class MatrizTransformadas {
   static Scanner cs=new Scanner(System.in);
    public static void imprimirMatriz(int[][] M){
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
               if(j==0 && i!=0){System.out.println("");}
                System.out.print("\t"+M[i][j]+"|");
            }
        }
        System.out.println("");
    }
    
    public static int[][] transformada01(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim-i; j++) {                
                M[i][j]=numInit+(i+j)*(i+j+1)/2 + i;               
            }
        }
        
        return M;
    }
    
    public static void main(String[] args) {
        imprimirMatriz(transformada01());
    }
}
