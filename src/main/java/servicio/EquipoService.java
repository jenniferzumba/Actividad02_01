/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Equipo;


/**
 *
 * @author jenniferzumba
 */
public interface EquipoService {
    public abstract void crear( Equipo equipo);
    public abstract List<Equipo>list();
    public abstract void eliminar(int codigo);
    public abstract void modificar(int codigo, Equipo equipoModificado); 
    
}
