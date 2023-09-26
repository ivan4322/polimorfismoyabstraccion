/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author Ivan
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        
        // TODO code application logic here
        
       
        
        
        Perro perro = new Perro();
        perro.setNombre("zeuss");
        System.out.println(perro.sonido()); 
        Gato gato = new Gato ();
         System.out.println("sonido" +
        gato.sonido()); 
         
        
        
        Centro centro = new Centro ();
        centro.agregarAnimal(perro);
        centro.listaAnimal();
        
        System.out.println("   ");
        
        
        gato.setNombre("cat");
        centro.agregarAnimal(gato);
        centro.listaAnimal();
        
        
    }
    
}
