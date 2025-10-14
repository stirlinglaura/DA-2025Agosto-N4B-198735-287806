/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package da.obligatorio.peajes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Respuesta {
    private String id;
    private Object parametro;

    public Respuesta(String id, Object parametro) {
        this.id = id;
        this.parametro = parametro;
    }

    public Respuesta() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getParametro() {
        return parametro;
    }

    public void setParametro(Object parametro) {
        this.parametro = parametro;
    }
    
    public static List<Respuesta> lista(Respuesta... respuestas){
         List<Respuesta> retorno = new ArrayList();
         for(Respuesta r:respuestas){
             retorno.add(r);
         }
         return retorno;
    }
    
    
}
