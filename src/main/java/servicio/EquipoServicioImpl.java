/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Equipo;


/**
 *
 * @author jenniferzumba
 */
public class EquipoServicioImpl implements EquipoService{
    private final ArrayList<Equipo> equipoList;
    
    public EquipoServicioImpl() {
        this.equipoList = new ArrayList<>();
    }

    @Override
    public void crear(Equipo equipo) {
        this.equipoList.add(equipo);
    }

    @Override
    public List<Equipo> list() {
        return this.equipoList;
    }

    @Override
    public void eliminar(int codigo) {
         var indice=0;
        for(var pais:this.equipoList){
            if(pais.getCodigo()==codigo){
                this.equipoList.remove(indice);
                break;
                
            }
            else{
                indice++;
            }
            
        }
    }

    @Override
    public void modificar(int codigo, Equipo equipoModificado) {
         var indice=0;
        this.equipoList.set(indice, equipoModificado);
    }

    @Override
    public String toString() {
        return "EquipoServicioImpl{" + "equipoList=" + equipoList + '}';
    }
    
    
}
