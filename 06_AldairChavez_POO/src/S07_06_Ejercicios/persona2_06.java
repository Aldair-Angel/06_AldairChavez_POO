package S07_06_Ejercicios;

/**
 *
 * @author User
 */
public class persona2_06 {
    
    //Atributos
    String apodo;
    String cargo;
    int añosExperiencia;

    //Albañil
    public persona2_06(String apodo, String cargo, int añosExperiencia) {
        this.apodo = apodo;
        this.cargo = cargo;
        this.añosExperiencia = añosExperiencia;
    }
    
    //Metodos con valores de retorno
    public String probar(){
        return apodo+ " prueba el pan";
    }
    public String lider(){
        return apodo+ " manda a los demas empleados bajo su cargo de "+cargo;
    }
    public String experiencia(){
        return apodo+ " tiene " +añosExperiencia+ " años de experiencia siendo " +cargo;
    }
}
