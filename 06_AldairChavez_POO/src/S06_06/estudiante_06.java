package S06_06;

/**
 *
 * @author User
 */
public class estudiante_06 {
     
    //atributos
    String nombre;
    String apellido;
    
    //metodos
    public void estudiar(){
        System.out.println("El estudiante se pone a estudiar");
    }

    public void leer(){
        System.out.println("El alumno lee varios libros");
    }
    
    //sobrecarga de constructores
    public estudiante_06(String nombreEstudiante, String apellidoEstudiante) {
        nombre = nombreEstudiante;
        apellido = apellidoEstudiante;
    }

    public estudiante_06(String apellido) {
        this.apellido = apellido;
    }
    
    //metodos con valores de retorno
    public String correr(){
        return "El estudiante corre";
    }
    
    public String exponer(){
        return "El estudiante se pone a exponer su tarea";
    }
    
    //sobre carga de metodos
    public void identificarse (){
        System.out.println("Soy " +nombre+ "y mi apellido es "  +apellido);
    }
    
    public void identificarse(int edad){
        System.out.println("soy "+nombre+ " mi apelido es "+apellido+ " y mi edad es "+edad+" años");
    }
    
}
