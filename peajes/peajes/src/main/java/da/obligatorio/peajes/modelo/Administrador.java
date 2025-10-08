package da.obligatorio.peajes.modelo;

public class Administrador {
    public String nombre;
    public String contrasenia;
    public String cedula;

    public Administrador(String nombre, String contrasenia,String cedula) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.cedula = cedula;
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

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
