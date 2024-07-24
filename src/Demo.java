import ejercicio1.PilaSofisticada;
import ejercicio2.Pila;
import ejercicio4.*;

public class Demo {

    public static void main(String[] args){
        Solitario s1 = null;
        try{
            s1 = new Solitario();
            Carta c1 = new Carta(Palo.CORAZON, 10);
            Carta c2 = new Carta(Palo.CORAZON, 9);
            Carta c3= new Carta(Palo.CORAZON, 8);
            Carta c4 = new Carta(Palo.DIAMANTE, 7);
            Carta c5 = new Carta(Palo.CORAZON, 6);
            Carta c6 = new Carta(Palo.PICA, 5);
            s1.apilar(c1);
            s1.apilar(c2);
            s1.apilar(c3);
            s1.apilar(c4);
            s1.apilar(c5);
            s1.apilar(c6);
        }
        catch(NumIncorrectoEx | ApilarEx e){
            System.err.println(e.getMessage());
        }
        finally {
            System.out.println(s1);
        }

    }
}
