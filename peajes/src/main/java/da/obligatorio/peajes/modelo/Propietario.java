package da.obligatorio.peajes.modelo;

import java.util.List;
import da.obligatorio.peajes.modelo.Estado;
import da.obligatorio.peajes.modelo.Vehiculo; 

public class Propietario {
    public String cedula;
    public String nombre;
    public String contrasena;
    public double saldo; //hacer saldominimocomometodo Saldo mínimo para alerta: 500
    public Estado estado;
    public List<Vehiculo> vehiculos;
    public List<Notificacion> notificaciones; 
    public List<Asignacion> asignaciones; 

    public Propietario(String cedula, String nombre, String contrasena, Double saldo, Estado estado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.saldo = saldo;
        this.estado.nombre="Habilitado";
    }

    public String getCedula() {
        return cedula;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public boolean setCedula(String unaCedula) {
       if(verificarCedula(unaCedula)){
            cedula = unaCedula;
            return true;
       }return false;
       
    }

    //Metodos agregados 
    // agregar notificaciones, vehiculos y asignaciones
      
    
    public boolean verificarCedula(String cedula){
        boolean ok = false;
        if (cedula !=null){
            int digitos = cedula.length();
            String numeros = "0123456789";
            boolean soloNumeros = true;
            cedula = cedula.toLowerCase();
            for (int x=0;x<cedula.length()&&soloNumeros;x++){
                String d = cedula.charAt(x)+"";
                if (!numeros.contains(d)){
                    soloNumeros = false;
                }
            }
           
            if (soloNumeros && digitos>=6&&digitos<=8){
                ok = true;
            }    
        }
        return ok;        
    
    }

    public boolean haySaldoMinimo(){
        return this.saldo >= 500;
    }   

    public double actualizarSaldo(double montoGastado){
        return this.saldo - montoGastado;
    }

    public void eliminarNotificaciones(){
        this.notificaciones.clear();
    }

    
}
