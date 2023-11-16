package S07_06;

/**
 *
 * @author User
 */
public class persona_06 {

    public persona_06(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //atributos
    String nombre;
    String apellido;
    int edad;
    
    //metodos 
    public void correr(){
        
    }
    public void saltar(){
        
    }
    
    //sobrecarga de metodos
    public void jugarFutbol(){
        System.out.println(nombre+ " Juega futbol");
    }
    public void jugarFutbol(int edad){
        System.out.println(nombre+ " Juega futbol con " +edad+ " años");
    }
    
    //metodos con valores de retorno
    public String comer(){
        return nombre+ "come pan";
    }
    public String almacenar(){
        return nombre+ "almacena el balon de futbol";
    }
    
    //Metodos con parametros y argumentos
    public void correrRapido(int velocidad, int distancia){
        System.out.println(nombre+ " corre a una velocidad de "+velocidad+"km por hora, durante "+distancia+" metros,");
    }
    
    public void dormir(int hora, int levantar){
        System.out.println(nombre+ " duerme a las "+hora+" y se levanta a las "+levantar);
    }
            
}
