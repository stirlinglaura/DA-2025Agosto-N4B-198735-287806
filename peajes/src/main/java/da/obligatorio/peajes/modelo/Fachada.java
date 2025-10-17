package da.obligatorio.peajes.modelo;

public class Fachada {

    private SistemaAcceso sAcceso = new SistemaAcceso();

     //SINGLETON

    private static Fachada instancia = new Fachada();

    public static Fachada getInstancia() {
        return instancia;
    }
    
    private Fachada() {
    }

      //DELEGACIONES

}
