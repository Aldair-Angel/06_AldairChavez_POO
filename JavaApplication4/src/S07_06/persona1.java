/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S07_06;

/**
 *
 * @author User
 */
public class persona1 {
    public void MayorDeEdad(int edad, String nombre,float altura){
        if(edad <= 18){
            System.out.println("El ciudadano" + nombre + "Es mayor de edad, cuenta con una altura de," + altura);  
        }
    }
}
