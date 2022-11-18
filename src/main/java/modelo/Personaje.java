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
public class Personaje {
    private String nombre;
    private int edad;
    private Pelicula pelicula;
    private String genero;
    private double horaTrabajadas;
    private LocalDate fechaNacimiento;

    public Personaje(String nombre, int edad, Pelicula pelicula, String genero, double horaTrabajadas,LocalDate fn) {
        this.nombre = nombre;
        this.edad = edad;
        this.pelicula = pelicula;
        this.genero = genero;
        this.horaTrabajadas = horaTrabajadas;
        this.fechaNacimiento=fn;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setHoraTrabajadas(double horaTrabajadas) {
        this.horaTrabajadas = horaTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public String getGenero() {
        return genero;
    }

    public double getHoraTrabajadas() {
        return horaTrabajadas;
    }
    public int calcularEdad(){
        var yearActual = LocalDate.now().getYear();
         var diaActual = LocalDate.now().getDayOfMonth();
         var mesActual = LocalDate.now().getMonthValue();
         var edad = 0;
         var diaNacimiento = fechaNacimiento.getDayOfMonth();
         var mesNacimiento = fechaNacimiento.getMonthValue();
         var yearNacimiento = fechaNacimiento.getYear();

         if (diaNacimiento < diaActual) {
             mesActual -= 1;

             if(mesNacimiento < mesActual){
                 yearNacimiento -= yearActual -1;                
             }else{
                 yearNacimiento -= yearActual;
             }
         }else{
             if(mesNacimiento < mesActual){
                 yearNacimiento -= yearActual -1;

             }else{
                 yearNacimiento -= yearActual;
             }
         }
         edad = yearNacimiento;
         return edad;
     
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", edad=" + edad + ", pelicula=" + pelicula + ", genero=" + genero + ", horaTrabajadas=" + horaTrabajadas + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
    
    
    
}
