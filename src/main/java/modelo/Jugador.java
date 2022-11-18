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
public class Jugador {
    private String nombre;
    private int edad;
    private double salario;
    private String tipoDeporte;
    private LocalDate fechaNacimiento;

    public Jugador(String nombre, int edad, double salario, String tipoDeporte,LocalDate fn) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.tipoDeporte = tipoDeporte;
        this.fechaNacimiento=fn;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechanacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechanacimiento() {
        return fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }
    
    private int calcularEdad() {
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
        return "Jugador{" + "nombre=" + nombre + ", edad=" + edad +
                ", salario=" + salario + ", tipoDeporte=" + tipoDeporte + 
                ", fechaNacimiento=" + fechaNacimiento + '}';
    }

    
    
    
    
}
