
package polimorfos;


public class Ventas extends Personal{
    String zona;
    String sucursal;

    public Ventas() {
    }
    

    public Ventas(String zona, String sucursal, int carnet, String nombre, String apellido) {
        super(carnet, nombre, apellido);
        this.zona = zona;
        this.sucursal = sucursal;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    
}
