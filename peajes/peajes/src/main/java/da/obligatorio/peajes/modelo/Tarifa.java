package da.obligatorio.peajes.modelo;

public class Tarifa {
    public double Monto;
    

    public Tarifa(double monto) {
        Monto = monto;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double monto) {
        Monto = monto;
    }
}
