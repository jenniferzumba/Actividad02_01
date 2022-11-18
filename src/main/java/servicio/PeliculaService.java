/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Pelicula;


/**
 *
 * @author jenniferzumba
 */
public interface PeliculaService {
     public abstract void crear( Pelicula pelicula);
    public abstract List<Pelicula>list();
    public abstract void eliminar(String titulo);
    public abstract void modificar( Pelicula peliculaModificado); 
    
    
}
