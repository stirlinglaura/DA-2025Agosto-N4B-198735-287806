package da.obligatorio.peajes.controlador;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

import java.util.List;

@RestController
@RequestMapping("/acceso")
public class ControladorLogin {

    @PostMapping("/loginPropietario")
    public List<Respuesta> loginPropietario(HttpSession sesionHttp, @RequestParam String cedula,
            @RequestParam String contrasena) {
        // Lógica de autenticación para el propietario
        return Respuesta.lista(new Respuesta("login", "Login de propietario exitoso"));
    }

    @PostMapping("/loginAdministrador")
    public List<Respuesta> loginAdministrador(HttpSession sesionHttp, @RequestParam String cedula,
            @RequestParam String contrasena) {
        // Lógica de autenticación para el administrador
        return Respuesta.lista(new Respuesta("login", "Login de administrador exitoso"));
    }

    @PostMapping("/logout")
    public List<Respuesta> logout(HttpSession sesionHttp) throws Exception {
        // Lógica para cerrar sesión

        // ***preguntar si tenemos que cerrar Sesion a nivel de HttpSession
        // al http se le tiene que cerrar la sesion?
        // sesionHttp.invalidate();
        return Respuesta.lista(new Respuesta("logout", "Logout exitoso"));
    }

}
