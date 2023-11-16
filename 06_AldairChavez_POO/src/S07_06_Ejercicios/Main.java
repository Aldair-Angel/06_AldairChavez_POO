package S07_06_Ejercicios;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        persona1_06 objpersona = new persona1_06("Juan", "Zapata");
        
        objpersona.estudiar("Matematica", 2);
        objpersona.trabajar(12, "Construccion");
        objpersona.jugar("tarde", "Roberto", "Parque");
        
        persona2_06 objpersona2 = new persona2_06("Checho", "Albañil", 3);
        
        String trabajo = objpersona2.experiencia();
        String liderar = objpersona2.lider();
        
        System.out.println(trabajo);
        System.out.println(liderar);
    }
    
}
