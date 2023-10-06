package S10_06;

/**
 *
 * @author User
 */
//atributos
public class futbolista_06 extends seleccionFutbol_06{
    
//metodo constructor
    public futbolista_06(int dorsal, String demarcacion, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }


//atributos
    private int dorsal;
    private String demarcacion;
    
//metodos
    public void jugar(){
        System.out.println(getNombre()+" esta jugando Partido" );
    }
    public void entrenar(){
        System.out.println(getNombre()+" esta Entrenando" );
    }
    
//GET add SET

    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    





}