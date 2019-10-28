/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.arreglos;

import pe.edu.upeu.subprogramas.LeerTeclado;

/**
 *
 * @author Laboratorio 7
 */
public class ArreglosJava {
    
    public int[] rellenarVector(int x){
        LeerTeclado lt=new LeerTeclado();
        int[] vector=new int[x];
        for (int i = 0; i < vector.length; i++) {
        vector[i]=lt.leer(0,"Ingrese valor en el indice "+i+" :");
        }
        imprimirVect(vector);
        return vector;
    }
    public void imprimirVect(int[] x){
        for (int i = 0; i < x.length; i++) {
            System.out.println("");
            System.out.println(x[i]);
        }
    }    
    public static void main(String[] args) {
        ArreglosJava aj=new ArreglosJava();
        aj.rellenarVector(5);
        
        int[] num1={1,2,5,7,9,0};
        char[] valc={'*','R','1','/','P'};
        double[] vald={1.2,2.5,5.2,7.9,9.2,0.3};
        boolean[] bool={false, true, false};
        String[] cadena={"Juan","Pedro", "Raul", "Daniel"};
        Object[] todo={'*',"Juan", 8, 3.5, false };
        
        int[] numX=new int[8];
        numX[0]=87;
        numX[1]=8;
        numX[2]=7;
        System.out.println("Dato:"+numX[0]);
        
        
        
        
    }
}
