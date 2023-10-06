package S10_06;

/**
 *
 * @author User
 */

public class masajista_06 extends seleccionFutbol_06 {

    public masajista_06(String titulacion, int añosExperiencia, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

//atributos
    private String titulacion;
    private int añosExperiencia;

//metodos 

    public void darMasaje() {
        System.out.println(nombre + "da masajes");
    }
    






}