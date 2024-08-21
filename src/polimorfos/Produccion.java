
package polimorfos;

public class Produccion extends Personal{
    String planta;
    String maquina;

    public Produccion() {
    }

    public Produccion(String planta, String maquina, int carnet, String nombre, String apellido) {
        super(carnet, nombre, apellido);
        this.planta = planta;
        this.maquina = maquina;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }
    
}
