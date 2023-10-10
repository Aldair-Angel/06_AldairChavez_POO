package S11_06;

/**
 *
 * @author LAB12
 */
public class Estudiante_06 extends Persona_06{

    public Estudiante_06(String carrera, int numeroDeOrden, int ciclo, String nombre, int edad) {
        super(nombre, edad);
        this.carrera = carrera;
        this.numeroDeOrden = numeroDeOrden;
        this.ciclo = ciclo;
    }
    
    //atributos
    String carrera;
    int numeroDeOrden;
    int ciclo;
    
}
