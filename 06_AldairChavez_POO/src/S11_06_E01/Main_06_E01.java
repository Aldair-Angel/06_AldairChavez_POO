package S11_06_E01;

/**
 *
 * @author LAB12
 */
public class Main_06_E01 {
    
    public static void main(String[] args){
        
        //primer objeto
        Nutricionista_06_E01 objNutricionista = new Nutricionista_06_E01("Santa cecilia", "Nutricion", "Gran calidad", "Sam", 23);
        objNutricionista.cocinar();
        
        //segundo objetos
        Nadador_06_E01 objNadador = new Nadador_06_E01(12, 180, "Ganaddor de la natacion de america", "Pep", 54);
        objNadador.nadarMariposa();
        
        //tercer objeto
        Entrenador_06_E01 objEntrenador = new Entrenador_06_E01(21, 24, "Tecnico", "jose", 58);
        objEntrenador.entrenar();
    }
}
