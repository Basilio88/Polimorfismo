
package polimorfos;


public class Polimorfos {

    public static void main(String[] args) {
        
        //Un objeto de la clase padre puede almacenar un objeto de cualquiera de sus subclases. 
       
        Personal persona = new Personal();
        Ventas vendedor = new Ventas();
        persona = vendedor;
        
        Personal vector [] = new Personal [4];
        vector [0] = new Personal();
        vector [1] = new Ventas();
        vector [2] = new Produccion();
        vector [3] = new Gerencia();
    }
    
}
