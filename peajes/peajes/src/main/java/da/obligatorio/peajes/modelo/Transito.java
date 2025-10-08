package da.obligatorio.peajes.modelo;

import java.sql.Date;
import da.obligatorio.peajes.modelo.Puesto;
import da.obligatorio.peajes.modelo.Vehiculo;

public class Transito {
    public Vehiculo vehiculo;
    public Date fechaHora;
    public Puesto puesto;
    public double totalPagado;

    
    public Transito(Vehiculo vehiculo, Date fechaHora, Puesto puesto, double totalPagado) {
        this.vehiculo = vehiculo;
        this.fechaHora = fechaHora;
        this.puesto = puesto;
        this.totalPagado = totalPagado;
    }
    
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public Date getFechaHora() {
        return fechaHora;
    }
    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
    public Puesto getPuesto() {
        return puesto;
    }
    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }
    public double getTotalPagado() {
        return totalPagado;
    }
    public void setTotalPagado(double totalPagado) {
        this.totalPagado = totalPagado;
    }
}   
