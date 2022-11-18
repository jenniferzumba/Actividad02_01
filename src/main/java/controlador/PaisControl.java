/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import modelo.Pais;
import servicio.PaisServicioImpl;

/**
 *
 * @author jenniferzumba
 */
public class PaisControl {
     private  PaisServicioImpl paisServicioImpl;
     

    public PaisControl() {
        this.paisServicioImpl = new PaisServicioImpl();
    }

    public String crear(String[] data) {
        var retorno = "no se pudo crear el pais:";

        var codigo = Integer.valueOf(data[0]).intValue();
        var poblacion = Integer.valueOf(data[1]).intValue();
        var nombrePais = data[2];
        var nombrePresidente = data[3];
        var idioma = data[4];

        if (codigo < 1) {
            retorno += " Codigo de cliente incorrecto.";
        } else {
            if (poblacion < 1 || poblacion > 2000000000) {
                retorno += " La informacion de la poblacion no es valida";
            } else {
                var pais=new Pais(nombrePais,poblacion,nombrePresidente,idioma,codigo);
                
                this.paisServicioImpl.crear(pais);
                retorno = "El pais con codigo: " + pais.getCodigo()
                        + " ha sido creado de la manera correcta ";
            }
        }
        return retorno;
    }

        
       
    
    
}
