/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jenniferzumba
 */
public class Pais {
    private String nombrePais;
    private double poblacion;
    private String nombrePresidente;
    private String idioma;
    private int codigo;

    public Pais(String nombrePais, double poblacion, String nombrePresidente, String idioma, int codigo) {
        this.nombrePais = nombrePais;
        this.poblacion = poblacion;
        this.nombrePresidente = nombrePresidente;
        this.idioma = idioma;
        this.codigo=codigo;
        
        
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public double getPoblacion() {
        return poblacion;
    }

    public String getNombrePresidente() {
        return nombrePresidente;
    }

    public String getIdioma() {
        return idioma;
    }

   

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public void setPoblacion(double poblacion) {
        this.poblacion = poblacion;
    }

    public void setNombrePresidente(String nombrePresidente) {
        this.nombrePresidente = nombrePresidente;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    private String poblacionValida() {
        var retorno = " ";
        var amplitud = this.poblacion;
        if (amplitud > 0 && amplitud < 2000000000) {
            retorno = "Pais validado";

        } else {
            retorno = "La poblacion no es correcto";
        }
        return retorno;
    }
    

    @Override
    public String toString() {
        return "Pais{" + "nombrePais=" + nombrePais + ", poblacion=" + poblacion + ", nombrePresidente=" + nombrePresidente + ", idioma=" + idioma + ", codigo=" + codigo + '}';
    }

   
   
    
    
    
}
