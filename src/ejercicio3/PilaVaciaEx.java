package ejercicio3;

public class PilaVaciaEx extends Exception{

    public PilaVaciaEx(){
        super("La pila esta vacia, no se puede quitar o consultar elementos!");
    }
}
