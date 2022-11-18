/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import modelo.Equipo;
import modelo.Pais;
import servicio.EquipoServicioImpl;

/**
 *
 * @author jenniferzumba
 */
public class EquipoControl {
    private  EquipoServicioImpl equipoServicioImpl;

    public EquipoControl() {
        this.equipoServicioImpl = new EquipoServicioImpl();
    }
    
    public String crear(String[] data1){
        var retorno=" no se pudo crear el jugador";
        var codigo=Integer.valueOf(data1[0]).intValue();
        var nombreEquipo=data1[1];
        var nombreTecnico=data1[2];
        var numeroJugadores=Integer.valueOf(data1[3]).intValue();
        var lugarEntrenamito=data1[4];
        
        if (codigo < 1) {
            retorno += " Codigo es incorrecto.";
        } else {
            if (numeroJugadores < 1 || numeroJugadores > 30) {
                retorno += " los jugadores  no son validas";
            } else {
                var equipo=new Equipo(nombreEquipo,codigo,nombreTecnico,numeroJugadores,lugarEntrenamito);
                
                this.equipoServicioImpl.crear(equipo);
                retorno = "El equipo con codigo: " + equipo.getCodigo()
                        + " ha sido creado de la manera correcta ";
            }
        }
        return retorno;
        
    }
}
