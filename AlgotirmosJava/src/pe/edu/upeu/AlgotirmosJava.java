/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu;

import java.util.Scanner;

public class AlgotirmosJava {
    //Creando un Objeto
    static Scanner cs=new Scanner(System.in);    
    public static void main(String[] args) {               
        //definiendo tipo de Variables
        int xCantLapices;
        double pago;
        //Leer Datos desde el Teclado
        System.out.println("Ingrese la Cantidad de Lapices a comprar:");
        xCantLapices=cs.nextInt();
        //Proceso
        if(xCantLapices>=1000){
            pago=xCantLapices*0.85;
        }else{
            pago=xCantLapices*0.90;
        } 
        //resultado
        System.out.println("El Monto a pagar es :"+pago +" Soles");
    }
    
}
