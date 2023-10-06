package S10_06;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Main_S10_06 {
    
    public static ArrayList<seleccionFutbol_06> integrantes = new ArrayList<seleccionFutbol_06>();
    
    public static void main(String[] args){
        
        futbolista_06 Paolo = new futbolista_06(9, "arquero", 1, "paolo", "guerrero", 42);
        masajista_06 raulMartinez = new masajista_06("si", 15, 2, "raul", "Martinez", 50);
        entrenador_06 RicardoGareca = new entrenador_06("uno", 1, "Ricardo", "Gareca", 65);
        
        integrantes.add(Paolo);
        integrantes.add(raulMartinez);
        integrantes.add(RicardoGareca);
        
        //ENTRENAR
        RicardoGareca.entrenamiento();
        RicardoGareca.viajar();        
    }
}
