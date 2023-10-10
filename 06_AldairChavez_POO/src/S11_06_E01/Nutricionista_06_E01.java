/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_06_E01;

/**
 *
 * @author LAB12
 */
public class Nutricionista_06_E01 extends Persona_06_E01{

    public Nutricionista_06_E01(String graduado, String especialidad, String CalificacionCalidad, String nombre, int edad) {
        super(nombre, edad);
        this.graduado = graduado;
        this.especialidad = especialidad;
        this.CalificacionCalidad = CalificacionCalidad;
    }
    
    //atributos
    String graduado;
    String especialidad;
    String CalificacionCalidad;
    
    public void cocinar(){
        
    }
    public void entrevistar(){
        
    }
}
