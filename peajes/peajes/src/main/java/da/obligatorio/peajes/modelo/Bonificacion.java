package da.obligatorio.peajes.modelo;

public class Bonificacion {
    public String nombre;
    public double monto;


    
    public Bonificacion(String nombre, double monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
