package S06_06;

/**
 *
 * @author User
 */
public class calculadora_06 {
    
    //atributos
    int a;
    int b;
    
    //metodos
    public void sumar (int d, int e){
        a = d + e;
        System.out.println(a);
    }
    
    public void restar (int d, int e){
        a = d - e;
        System.out.println(a);
    }
    
    //sobrecarga de constructores
    public calculadora_06(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public calculadora_06(int b) {
        this.b = b; 
    }
    
    //metoos con valores de retorno
    public int sumarRegresa (){
        return a + b;
    }
    
    public int restaRegresa (){
        return a - b;
    }
    
    //sobrecarga de metodos
    public void multiplicar(int d, int e){
        a = d * e;
        System.out.println(a);
    }
    
    public void multiplicar(int d){
        a = d;
        System.out.println(a);
    }
}
