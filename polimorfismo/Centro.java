/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;
/*
import java.util.ArrayList;
import java.util.List;
*/
import java.util.*;
/**
 *
 * @author Ivan
 */
public class Centro {
  private List<Animal> animalesDisponibles;

    public Centro() {
        this.animalesDisponibles= new ArrayList<>();
    }
  
  public void agregarAnimal(Animal animal){
  animalesDisponibles.add(animal);
      
  }
  
  public void listaAnimal(){
      System.out.println("Animales disponibles " );
     for (Animal animal : animalesDisponibles){
         System.out.println("Nombre " +animal.getNombre()+ "  " + animal.getColor());
        if (animal instanceof Perro ){
            System.out.println("el nombre  es " + ((Perro)animal).getNombre()); 
        }else if (animal instanceof Gato){
          System.out.println("el nombre  es " + ((Gato)animal).getNombre());   
        }
              
        
     
     }
      
      
  }
    
    
}
