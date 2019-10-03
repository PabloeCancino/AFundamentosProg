/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu;

import java.math.BigInteger;

/**
 *
 * @author Laboratorio 7
 */
public class Reforzamiento {
    /*
        System.out.println("byte\t" + Byte.MIN_VALUE + "\t" + Byte.MAX_VALUE);
        System.out.println("short\t" + Short.MIN_VALUE + "\t" + Short.MAX_VALUE);
        System.out.println("int\t" + Integer.MIN_VALUE + "\t" + Integer.MAX_VALUE);
        System.out.println("long\t" + Long.MIN_VALUE + "\t" + Long.MAX_VALUE);
        System.out.println("float\t" + Float.MIN_VALUE + "\t" + Float.MAX_VALUE);
        System.out.println("double\t" + Double.MIN_VALUE + "\t" + Double.MAX_VALUE);    
    */
    BigInteger factorial(int numero){
    BigInteger resultado=BigInteger.valueOf(numero);
    for (int i = 1; i <= numero; i++) {
        resultado=resultado.multiply(BigInteger.valueOf(i));
    }  
    return resultado;
    }
    
    int sumaEntre2Numeros(int numInit, int numFinal){
        int resultSuma=0;
        for (int i = numInit; i <= numFinal; i++) {
            if(i%2==0){
            resultSuma=resultSuma+i;
            }
        }
        return resultSuma;
    }
    
    public static void main(String[] args) {
        Reforzamiento r=new Reforzamiento();
        for(int j=1; j<10; j++){
        System.out.println("Factorial de "+j+":"+String.valueOf(r.factorial(j)));
        }   
        LeerTeclado lt=new LeerTeclado();
        int numInit=lt.leer(0, "Ingrese el primer numero:");
        int numFinal=lt.leer(0, "Ingrese el siguiente numero:");      
        System.out.println("El resultado es:"+r.sumaEntre2Numeros(numInit, numFinal));
        
    }
}
