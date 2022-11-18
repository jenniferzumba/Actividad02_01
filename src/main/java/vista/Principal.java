/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.EquipoControl;
import controlador.PaisControl;
import controlador.PeliculaControl;
import java.time.LocalDate;
import modelo.Equipo;
import modelo.Pais;
import modelo.Pelicula;
import servicio.PaisServicioImpl;
import servicio.EquipoServicioImpl;
import servicio.PeliculaServicioImpl;

/**
 *
 * @author jenniferzumba
 */
public class Principal {
    public static void  main(String[]args){
        
        var estadosUnidos=new Pais("Estados Unidos",100000000," Joe Biden "," English",14);
        var cuba=new Pais("Cuba",1200000," Miguel Diaz"," Spanish",12);
        var colombia=new Pais ("colombia",14000000," Gustavo Petro","Spanish",11);
        var argentina=new Pais("Argentina",19000000,"Alberto Fernadez","Spanish",10);
        var argentinanuevo=new Pais("Argentina",2000000,"Alberto Fernandes","spanish",20);
        
        var paisDB=new PaisServicioImpl();
        paisDB.crear(estadosUnidos);
        paisDB.crear(cuba);
        paisDB.crear(colombia);
        paisDB.crear(argentina);
        System.out.println(paisDB.list()+"\n");
        paisDB.eliminar(11);
        paisDB.eliminar(12);
        System.out.println(paisDB.list()+"\n");
        paisDB.modificar(10, argentina);
        System.out.println(paisDB.list()+"\n");
 
        var pais =new PaisControl();
        var data=new String[5];
        data[0]="12";
        data[1]="700000";
        data[2]="Ecuador";
        data[3]="Guillermo Laso";
        data[4]="Spanish";
        
        System.out.println(pais.crear(data)+"\n");
        
        System.out.print("\n");
        
        var equipo=new Equipo("Ecuador",10,"Alfaro",20," En las canchas de Guayaquil");
        var equipo1=new Equipo("Chile",12,"Eduardo",23," centro de entrenamineto olmpico");
        var equipo2=new Equipo("Colombia",9,"Nestor lorenzo",25," Bogota");
        var equipo3=new Equipo(" Argentina",4,"Lionel ",24," Buenos Aires");
        var equiponuevo=new Equipo("Argentina",3,"Lionel Scaloni",26,"Buenos Aires");
        
        var equipoDB=new EquipoServicioImpl();
        equipoDB.crear(equipo);
        equipoDB.crear(equipo1);
        equipoDB.crear(equipo2);
        equipoDB.crear(equipo3);
        System.out.println(equipoDB.list()+"\n");
        equipoDB.eliminar(12);
        equipoDB.eliminar(9);
        System.out.println(equipoDB.list()+"\n");
        equipoDB.modificar(4, equiponuevo);
        System.out.println(equipoDB.list()+"\n");
        
        var equi =new EquipoControl();
        var data1=new String [5];
        data1[0]=" 11";
        data1[1]=" Qatar ";
        data1[2]=" Félix Sánchez Bas ";
        data1[3]=" 23 ";
        data1[4]=" Canchas de Estadio de qatar ";
        System.out.println(equi.crear(data1)+"\n");
      
        System.out.print("\n");
        
        var piratas= new Pelicula("Pirastas del caribe","Comedia","Tipo P", LocalDate.of(2000, 02, 01),"Estados Unidos");
       var escalera= new Pelicula("Escalera al cielo", "Drama", "Tipo D",LocalDate.of(1999, 02, 01),"Japón");
       var crepusculo= new Pelicula("Amanecer parte 1", "Fantasía", "Tipo C",LocalDate.of(2010, 03, 01), "Canada");
       var escaleraNuevo=new Pelicula(" ESCALERA AL CIELO"," DRAMA","TIPO D",LocalDate.of(2000, 12, 22),"Corea del Sur");
       var peliculaPP = new PeliculaServicioImpl();
       peliculaPP.crear(piratas);
       peliculaPP.crear(escalera);
       peliculaPP.crear(crepusculo);
       System.out.println(peliculaPP.list());
       peliculaPP.eliminar("piratas");
       System.out.println(peliculaPP.list());
       peliculaPP.modificar( escalera);
       System.out.println(peliculaPP.list());
       
       var peliculaControl = new PeliculaControl();
       var data2= new String[7];
       data2[0]="Piratas del Caribe";
       data2[1]="Comedia";
       data2[2]="Tipo P";
       data2[3]="2002";
       data2[4]="02";
       data2[5]="01";
       data2[6]="Estados Unidos";
       
       System.out.println(peliculaControl.crear(data));
    }
        
    
    
}
