package da.obligatorio.peajes.modelo;


import java.util.List;
import da.obligatorio.peajes.modelo.Tarifa;
import da.obligatorio.peajes.modelo.Transito;

public class Puesto {
    public String nombre;
    public String direccion;
    public List<Tarifa> tarifa;
    public List<Transito> transito;


    
    public Puesto(String nombre, String direccion, List<Tarifa> tarifa, List<Transito> transito) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tarifa = tarifa;
        this.transito = transito;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public List<Tarifa> getTarifa() {
        return tarifa;
    }
    public void setTarifa(List<Tarifa> tarifa) {
        this.tarifa = tarifa;
    }   
    
//Metodos agregados
      public boolean verificarPuesto(Puesto unPuesto){
       if(unPuesto != null){
        return true;
       } return false;
    }
}
