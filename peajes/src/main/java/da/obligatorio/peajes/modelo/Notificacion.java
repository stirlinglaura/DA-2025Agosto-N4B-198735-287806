package da.obligatorio.peajes.modelo;

import java.sql.Date;
import java.util.List;

public class Notificacion {
    public String mensaje;
    public Date fechaHoraEnvio;
    public List<Propietario> propietarios;

    public Notificacion(String mensaje) {
        this.mensaje = mensaje;
    }
    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
   

    
}