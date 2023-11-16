package S07_06_Ejercicios;

/**
 *
 * @author User
 */
public class persona1_06 {
    
    String nombre;
    int  edad;
    String apellido;

    public persona1_06(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //Metodos con parametros
    public void estudiar(String curso, int horas){
        System.out.println("La persona llamada "+nombre+" "+apellido+ " estudia el curso de "+curso+" por "+horas+" horas.");
    }
    
    public void trabajar(int horas, String trabajo){
        System.out.println(nombre+ " trabaja en "+trabajo+" durante "+horas+ " horas");
    }
    
    public void jugar(String etapa, String amigo, String lugar){
        System.out.println(nombre+ " juega en el "+lugar+" con "+amigo+ " a la " +etapa);
    }
}
