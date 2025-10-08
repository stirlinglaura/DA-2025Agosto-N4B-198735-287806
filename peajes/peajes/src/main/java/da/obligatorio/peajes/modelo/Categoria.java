package da.obligatorio.peajes.modelo;

public class Categoria{
    public String nombre;
    public Tarifa tarifa;

    public Categoria(String nombre, Tarifa tarifa) {
        this.nombre = nombre;
        this.tarifa = tarifa;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Tarifa getTarifa() {
        return tarifa;
    }
    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }
}
