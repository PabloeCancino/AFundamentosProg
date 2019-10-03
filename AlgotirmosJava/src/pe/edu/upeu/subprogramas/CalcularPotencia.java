
package pe.edu.upeu.subprogramas;

public class CalcularPotencia {
    // <double> tipo de retorno de resultado 3 3
    public static double potencia(double x,int n){
        double resultado=1;
        for (int i = 1; i <=Math.abs(n); i++) {
            resultado=resultado*x;
        }
        if(n<0){
        resultado=1/resultado;
        }
        return resultado; //es el Retorno de tipo double
    }
    
    public double potenciaTipoDos(double x,int n){
        double resultado=1;
        for (int i = 1; i <=Math.abs(n); i++) {
            resultado=resultado*x;
        }
        if(n<0){
        resultado=1/resultado;
        }
        return resultado; //es el Retorno de tipo double
    }    
    
    public static void main(String[] args) {        
        LeerTeclado lt=new LeerTeclado();
        double base=lt.leer(0.0, "Numero Base:");
        int elebadoa=lt.leer(0, "Numero Elebado a:");
        System.out.println(potencia(base, elebadoa));
        //Creando un Objeto con el mismo nombre de la clase
        CalcularPotencia cp=new CalcularPotencia();//cp es un Objeto        
        System.out.println(cp.potenciaTipoDos(base, elebadoa));
        }
   
}