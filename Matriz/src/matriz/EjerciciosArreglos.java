
package matriz;

import java.util.Scanner;

public class EjerciciosArreglos {
 
    public static void imprimirVector(int[] x){
        for (int i = 0; i < x.length; i++) {
            System.out.print("|"+x[i]);
        }
        System.out.println("");
    }
    
    public static int[] almacenarDatosArreglo(int tamanho) {
        Scanner cs=new Scanner(System.in);
        int[] vector=new int[tamanho];
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingres un dato en el ventor["+i+"]=");
            vector[i]=cs.nextInt();
            System.out.println("");
        }
        return vector;
    }
    
    public static int[] sumaArreglos(int[] a, int[] b ){
        int[] c=new int[a.length];
        for (int i = 0; i < c.length; i++) {
            c[i]=a[i]+b[i];
        }
    return c;
    }
    
    public static void main(String[] args) {        
        int[] a=almacenarDatosArreglo(5);
        imprimirVector(a);
        int[] b=almacenarDatosArreglo(5);
        imprimirVector(b);
        
        int[] c=sumaArreglos(a,b);
        imprimirVector(c);
    }
}
