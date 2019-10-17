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
        
        /*//definir arreglo  (Vector)
        int[] vector={5,2,3,4};                
        System.out.println("Tamaño del Vector:"+vector.length);
        vector[1]=6;//Cambiando el valor de un vector en la posicion 1
        System.out.println("vector:"+vector[1]);
        
        int[] vec=new int[3];
        vec[0]=78;
        vec[1]=8;
        vec[2]=10;
        System.out.println(vec[1]);
        System.out.println("Suma contenido:"+(vec[0]+vec[1]+vec[2])); */       
    }
}
