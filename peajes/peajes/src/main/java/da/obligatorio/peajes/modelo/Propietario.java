package da.obligatorio.peajes.modelo;

import java.util.List;
import da.obligatorio.peajes.modelo.Estado;
import da.obligatorio.peajes.modelo.Saldo; 
import da.obligatorio.peajes.modelo.Vehiculo; 

public class Propietario {
    public String cedula;
    public String nombre;
    public String contrasena;
    public Saldo saldo;
    public Saldo saldoMinimoAlerta;
    public Estado estado;
    public List<Vehiculo> vehiculos;

    public Propietario(String cedula, String nombre, String contrasena, Saldo saldo, Saldo saldoMinimoAlerta, Estado estado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.saldo = saldo;
        this.saldoMinimoAlerta = saldoMinimoAlerta;
        this.estado = estado;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public Saldo getSaldo() {
        return saldo;
    }

    public void setSaldo(Saldo saldo) {
        this.saldo = saldo;
    }

    public Saldo getSaldoMinimoAlerta() {
        return saldoMinimoAlerta;
    }

    public void setSaldoMinimoAlerta(Saldo saldoMinimoAlerta) {
        this.saldoMinimoAlerta = saldoMinimoAlerta;
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
}
