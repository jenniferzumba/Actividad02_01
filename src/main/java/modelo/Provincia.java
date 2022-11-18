/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jenniferzumba
 */
public class Provincia {
    private String Provincia;
    private int numeroCantones;
    private String municipio ;
    private String capital;
    private Pais pais;
    private String identificador;

    public Provincia(String Provincia, int numeroCantones, String municipio, String capital,Pais pais,String identificador) {
        this.Provincia = Provincia;
        this.numeroCantones = numeroCantones;
        this.municipio = municipio;
        this.capital=capital;
        this.pais=pais;
        this.identificador=identificador;
    }

    public String getProvincia() {
        return Provincia;
    }

   

    public int getNumeroCantones() {
        return numeroCantones;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getCapital() {
        return capital;
    }

    public Pais getPais() {
        return pais;
    }


    public void setNumeroCantones(int numeroCantones) {
        this.numeroCantones = numeroCantones;
    }
    

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    
    
    private String identificadorProvincias() {
        var retorno = " el identificador de cada provincia";
        switch (this.identificador) {
            case "A":
                retorno = " Azuay";
                break;
            case "B":
                retorno = " Bolivar";
                break;
            case "C":
                retorno = " Carchi";
                break;
            case "E":
                retorno = " Esmeraldas";
                break;
            case "G":
                retorno = " Guayas";
                break;
            case "H":
                retorno = " Chimborazo";
                break;
            case "I":
                retorno = " Imbabura";
                break;
            case "L":
                retorno = " Loja";
                break;
            case "P":
                retorno = " Pichincha";
                break;
            case "O":
                retorno = " El oro";
                break;
            case "R":
                retorno = " Los Rios";
                break;
            case "M":
                retorno = " Manabi";
                break;
            case "V":
                retorno = " Morona Santiago";
                break;
            case "N":
                retorno = " Napo";
                break;
            case "S":
                retorno = " Pastaza";
                break;
            case "Q":
                retorno = " Orellana";
                break;
            case "K":
                retorno = " Sucumbios";
                break;
            case "T":
                retorno = " Tungurahua";
                break;
            case "Z":
                retorno = " Zamora chinchipe";
                break;
            case "Y":
                retorno = " Santa Elena";
                break;
            case "J":
                retorno = " Santo domingo";
                break;
            case "W":
                retorno = " Galapagos";
                break;
            case "U":
                retorno = " Cañar";
                break;
            case "X":
                retorno = " Cotopaxi";
                break;
            default:
                retorno=" No coincide con ninguna provincia r";
        }
        return retorno;  
    }

    @Override
    public String toString() {
        return "Provincia{" + "Provincia=" + Provincia + ", numeroCantones=" 
                + numeroCantones + ", municipio=" + municipio + ", capital=" + 
                capital + ", pais=" + pais + ", identificador=" + identificador + '}';
    }


    
    
    
    
    
    
}
