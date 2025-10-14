package da.obligatorio.peajes.modelo;

import java.sql.Date;
import java.time.LocalDateTime;

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

    //Metodos agregados
    public double calcularTotalAPagar(double tarifa, double descuento){
        return tarifa - (tarifa * descuento);
    }

    public boolean VerificarFecha (LocalDateTime fecha){
        boolean ok = false;
      LocalDateTime fechaActual = LocalDateTime.now();
        if(fecha.isAfter(fechaActual) || fecha.isEqual(fechaActual)){
            ok = true;
        }
        return ok;
    }

  
}   
