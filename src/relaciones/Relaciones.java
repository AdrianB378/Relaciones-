
package relaciones;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {

    public static void main(String[] args) {
        
        // Creamos un auto
        Auto aut = new Auto();
        aut.setId(1L);
        aut.setMarca("Renault");
        aut.setModelo("Duster");
        
        //
        List<Propietario> listaPropietarios = new ArrayList <Propietario>();
        
        Propietario prop1 = new Propietario();
        Propietario prop2 = new Propietario();
        
        prop1.setId(35L);
        prop1.setNombre("Luisina");
        prop1.setApellido("de Paula");
        
        
        prop2.setId(23L);
        prop2.setNombre("Suscribite");
        prop2.setApellido("TodoCode");
        
       
        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);
       
        
        aut.setListaPropietarios(listaPropietarios);
        
        System.out.println("El auto " + aut.getMarca() + " " + aut.getModelo() + 
                           "Tiene como propietarios a: "  + aut.getListaPropietarios().toString());

        
    }
    
}
