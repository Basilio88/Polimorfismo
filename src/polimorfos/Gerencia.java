
package polimorfos;

public class Gerencia extends Personal{
    String cargo;
    int oficina;

    public Gerencia() {
    }

    public Gerencia(String cargo, int oficina, int carnet, String nombre, String apellido) {
        super(carnet, nombre, apellido);
        this.cargo = cargo;
        this.oficina = oficina;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getOficina() {
        return oficina;
    }

    public void setOficina(int oficina) {
        this.oficina = oficina;
    }
    
}
