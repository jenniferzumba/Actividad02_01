/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author jenniferzumba
 */
public class Pelicula {
     private String titulo;
    private String tipoPelicula;
    private String clasificacionPelicula;
    private LocalDate yearPublicacion;
    private String paisOrigen;

    public Pelicula(String titulo, String tipoPelicula, String clasificacionPelicula, LocalDate yearPublicacion, String paisOrigen) {
        this.titulo = titulo;
        this.tipoPelicula = tipoPelicula;
        this.clasificacionPelicula = clasificacionPelicula;
        this.yearPublicacion = yearPublicacion;
        this.paisOrigen = paisOrigen;
    }
    
    
    

    public String getTitulo() {
        return titulo;
    }

    public String getTipoPelicula() {
        return tipoPelicula;
    }

    public String getClasificacionPelicula() {
        return clasificacionPelicula;
    }

    public LocalDate getYearPublicacion() {
        return yearPublicacion;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTipoPelicula(String tipoPelicula) {
        this.tipoPelicula = tipoPelicula;
    }

    public void setClasificacionPelicula(String clasificacionPelicula) {
        this.clasificacionPelicula = clasificacionPelicula;
    }

    public void setYearPublicacion(LocalDate yearPublicacion) {
        this.yearPublicacion = yearPublicacion;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    private int obtenerYearPublicacion(){
        var yearActual= LocalDate.now().getYear();
        return yearActual-this.yearPublicacion.getYear();
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", tipoPelicula=" + tipoPelicula + ", clasificacionPelicula=" + clasificacionPelicula + ", yearPublicacion=" + yearPublicacion + ", paisOrigen=" + paisOrigen + '}';
    }
    
    
    
    
    
}
