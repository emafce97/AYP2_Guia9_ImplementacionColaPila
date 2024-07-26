package ejercicio4;

public class Carta implements Comparable<Carta> {

    private Palo palo;
    private int numero;

    public Carta(Palo palo, int numero) throws NumIncorrectoEx{
        if(numero < 1 || numero > 13){
            throw new NumIncorrectoEx();
        }else{
            this.palo = palo;
            this.numero = numero;
        }
    }

    public Palo getPalo() {
        return palo;
    }

    public int getNumero() {
        return numero;
    }

    public String toString(){
        return STR."Palo: \{this.palo} - Numero: \{this.numero}";
    }

    @Override
    public int compareTo(Carta o) {
        return Integer.compare(this.numero, o.getNumero());
    }
}
