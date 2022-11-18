/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import modelo.Pelicula;
import servicio.PeliculaServicioImpl;



/**
 *
 * @author jenniferzumba
 */
public class PeliculaControl {
    private  PeliculaServicioImpl peliculaServicioImpl;

    public PeliculaControl() {
        this.peliculaServicioImpl = new PeliculaServicioImpl();
    }
    public String crear(String [] data2){
        var retorno="No es posible crear la pelicula";
        var titulo=data2[0];
        var tipoPelicula=data2[1];
        var clasificacionPelicula=data2[2];
        var year=Integer.valueOf(data2[3]);
        var mes=Integer.valueOf(data2[4]);
        var dia=Integer.valueOf(data2[5]);
        var paisOrigen= data2[6];
        
        if (titulo==tipoPelicula){
            retorno+=" El titulo de la pelicula no fue creado correctamente";
        }
        else{
            var pelicula = new Pelicula(titulo,tipoPelicula,clasificacionPelicula,LocalDate.of(year, mes,dia),paisOrigen);
            this.peliculaServicioImpl.crear(pelicula);
            retorno= "Jugador "+pelicula.getTitulo()+" creado correctamente";
        }
        return retorno;
    }
    
    
}
