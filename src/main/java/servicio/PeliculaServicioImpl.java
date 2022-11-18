/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Pelicula;

/**
 *
 * @author jenniferzumba
 */
public class PeliculaServicioImpl implements PeliculaService  {
    private List<Pelicula> peliculaList;

    public PeliculaServicioImpl() {
        this.peliculaList=new ArrayList<>();
    }
    
    

    @Override
    public void crear(Pelicula pelicula) {
        this.peliculaList.add(pelicula);
        
    }

    @Override
    public List<Pelicula> list() {
        return this.peliculaList;
    }

    @Override
    public void eliminar(String titulo) {
        var indice=0;
        for(var pelicula:this.peliculaList){
            if(pelicula.getTitulo()==titulo){
                this.peliculaList.remove(indice);
                break;
            }
            else{
                indice++;
            }
        }
        
    }

    @Override
    public void modificar( Pelicula peliculaModificado) {
        var indice=0;
        this.peliculaList.set(indice, peliculaModificado);
    }
    
    
}
