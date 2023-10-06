package S10_06;

/**
 *
 * @author User
 */

public class entrenador_06 extends seleccionFutbol_06 {

    public entrenador_06(String idFederacion, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

//atributos
    private String idFederacion;

//metodos
    public void dirigirPartido() {
        
    }
    public void entrenamiento() {
        System.out.println("Soy el entrenador");
    }




}