import excepcionespila.PilaVaciaEx;
import pilalista.PilaLista;

public class Demo {

    public static void main(String[] args){
        try{
            PilaLista pa = new PilaLista();
            pa.apilar(1);
            pa.apilar(2);
            pa.apilar(3);
            pa.apilar(4);
            pa.apilar(5);
            pa.apilar(6);
            pa.apilar(7);
            pa.apilar(8);
            pa.apilar(9);
            pa.desapilar();
            pa.desapilar();
            pa.desapilar();
            pa.desapilar();
            System.out.println(pa);
            System.out.println(STR."El ultimo elemento de la pila es: \{pa.obtenerTope()}");
            System.out.println(STR."La pila esta vacia? \{pa.estaVacia()}");
            pa.desapilar();
            pa.desapilar();
            pa.desapilar();
            pa.desapilar();
            pa.desapilar();
            pa.desapilar();
            pa.desapilar();
            pa.desapilar();
        }catch (PilaVaciaEx ex){
            System.err.println(ex.getMessage());
        }
    }
}
