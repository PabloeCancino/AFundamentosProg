/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu;

/**
 *
 * @author Laboratorio 7
 */
public class Reforzamiento {
    
    int factorial(int numero){
    int resultado=1;
    for (int i = 1; i <= numero; i++) {
        resultado=resultado*i;
    }  
    return resultado;
    }
    
    public static void main(String[] args) {
        Reforzamiento r=new Reforzamiento();
        System.out.println("Factorial de 2"+r.factorial(2));
        System.out.println("Factorial de 3"+r.factorial(3));
        System.out.println("Factorial de 5"+r.factorial(5));
        System.out.println("Factorial de 9"+r.factorial(9));
        System.out.println("Factorial de 10"+r.factorial(10));
        System.out.println("Factorial de 15"+r.factorial(15));
        System.out.println("Factorial de 18"+r.factorial(18));
        System.out.println("Factorial de 20"+r.factorial(20));
        System.out.println("Factorial de 33"+r.factorial(33));
    }
}
