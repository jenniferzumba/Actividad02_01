/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Pais;

/**
 *
 * @author jenniferzumba
 */
public interface PaisService {
    public abstract void crear( Pais pais);
    public abstract List<Pais>list();
    public abstract void eliminar(int codigo);
    public abstract void modificar(int codigo, Pais paisModificado); 
    
    
    
}
