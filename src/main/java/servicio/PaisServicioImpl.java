/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Pais;

/**
 *
 * @author jenniferzumba
 */
public class PaisServicioImpl implements PaisService{
    private ArrayList<Pais> paisList;
    
    public PaisServicioImpl() {
        this.paisList = new ArrayList<>();
    }

    @Override
    public void crear(Pais pais) {
        this.paisList.add(pais);
    }

    @Override
    public List<Pais> list() {
        return this.paisList;
    }

   

    @Override
    public void modificar(int codigo, Pais paisModificado) {
        var indice=0;
        this.paisList.set(indice, paisModificado);
    }

    @Override
    public void eliminar(int codigo) {
        var indice=0;
        for(var pais:this.paisList){
            if(pais.getCodigo()==codigo){
                this.paisList.remove(indice);
                break;
                
            }
            else{
                indice++;
            }
            
        }
         
        
    }
    
    @Override
    public String toString() {
        return "PaisServicioImpl{" + "paisList=" + paisList + '}';
        
       
    }

   
    

     
}

    
