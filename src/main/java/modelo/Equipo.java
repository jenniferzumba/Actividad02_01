/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jenniferzumba
 */
public class Equipo {
    private String nombreEquipo;
    private int codigo;
    private String tecnico;
    private int numeroJugadores;
    private String lugarEntrenamiento;

    public Equipo(String nombreEquipo, int codigo, String tecnico, int numeroJugadores, String lugarEntrenamiento) {
        this.nombreEquipo = nombreEquipo;
        this.codigo = codigo;
        this.tecnico = tecnico;
        this.numeroJugadores = numeroJugadores;
        this.lugarEntrenamiento = lugarEntrenamiento;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTecnico() {
        return tecnico;
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public String getLugarEntrenamiento() {
        return lugarEntrenamiento;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    public void setLugarEntrenamiento(String lugarEntrenamiento) {
        this.lugarEntrenamiento = lugarEntrenamiento;
    }
    public String obtenerEquipo(){
        return " ";
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombreEquipo=" + nombreEquipo + ", codigo=" + codigo + ", tecnico=" + tecnico + ", numeroJugadores=" + numeroJugadores + ", lugarEntrenamiento=" + lugarEntrenamiento + '}';
    }
    
    
    
    
}
