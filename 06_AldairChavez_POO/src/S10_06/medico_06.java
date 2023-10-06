package S10_06;

/**
 *
 * @author User
 */
public class medico_06 extends seleccionFutbol_06 {

    public medico_06(String especialidad, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.especialidad = especialidad;
    }
    
//atributos
    private String especialidad;
    
//metodos
    public void atender() {
        
    }
}
