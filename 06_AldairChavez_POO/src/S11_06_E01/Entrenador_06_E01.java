/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_06_E01;

/**
 *
 * @author LAB12
 */
public class Entrenador_06_E01 extends Persona_06_E01{

    public Entrenador_06_E01(int añosExperienci, int idFederacion, String titulacion, String nombre, int edad) {
        super(nombre, edad);
        this.añosExperienci = añosExperienci;
        this.idFederacion = idFederacion;
        this.titulacion = titulacion;
    }
    
    //Atributos
    int añosExperienci;
    int idFederacion;
    String titulacion;
    
    public void entrenar(){
        System.out.println(nombre+ " tiene " +añosExperienci+ "años de experiencia");
    }
    public void gestionarIngresos(){
        
    }
}
