package S07_06;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        persona_06 objpersona = new persona_06("jose", "Huaman");
        persona_06 objpersona2 = new persona_06("Mario", "Bros");
        
        objpersona.jugarFutbol();
        objpersona2.jugarFutbol(19);
        
        persona_06 objpersona3 = new persona_06("Geampol", "Chauca");
        
        objpersona3.correrRapido(12, 300);
        objpersona3.dormir(11, 6);
    }
    
}
