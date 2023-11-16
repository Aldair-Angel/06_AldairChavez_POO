package S06_06;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //clase estudiante
        estudiante_06 estudiante1 = new estudiante_06("Pepe", "Vilcapuma");
        estudiante_06 estudiante2 = new estudiante_06("Jose", "Chaupin");

        System.out.println(estudiante1.apellido);
        System.out.println(estudiante2.nombre);
        
        estudiante_06 estudiante3 = new estudiante_06("Pepe", "Humala");
        estudiante3.identificarse();
        
        estudiante_06 estudiante4 = new estudiante_06("Pepe", "Humala");
        estudiante4.identificarse(16);

        //clase calculadora
        calculadora_06 cal = new calculadora_06(4, 6);
        calculadora_06 cal2 = new calculadora_06(13, 4);
        calculadora_06 cal3 = new calculadora_06(5);
        
        cal.sumar(10, 8);
        cal2.multiplicar(10, 5);
        
        cal3.a = 10;
        cal3.b = 15;
        
        int P = cal3.sumarRegresa();
        
        System.out.println(P);
    }
}
