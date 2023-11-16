/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_06_E01;

/**
 *
 * @author LAB12
 */
public class Nadador_06_E01 extends Persona_06_E01{

    public Nadador_06_E01(int añosEntrenados, int altura, String logros, String nombre, int edad) {
        super(nombre, edad);
        this.añosEntrenados = añosEntrenados;
        this.altura = altura;
        this.logros = logros;
    }
     
    //atributos
    int añosEntrenados;
    int altura;
    String logros;
    
    public void nadarMariposa(){
        System.out.println(nombre+ " sabe nadar muy bien de mariposa");
    }
    public void ejercicsioRespiracion(){
        
    }
}
