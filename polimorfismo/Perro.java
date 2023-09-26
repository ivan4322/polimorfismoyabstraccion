/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author Ivan
 */
public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String color, String tipo) {
        super(nombre, color, tipo);
    }
    
    public String sonido (){
        return "waoo";
    }

    @Override
    public String toString() {
        return "Perro{" + '}';
    }
    
    
    
}
