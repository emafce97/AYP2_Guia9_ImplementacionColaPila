package ejercicio1;

import java.util.Stack;
public class PilaSofisticada{

    private Stack<Integer> pila;

    public PilaSofisticada(){
        this.pila = new Stack<>();
    }

    public Stack<Integer> getPila(){
        return this.pila;
    }

    public void setPila(Stack<Integer> p){
        this.pila = p;
    }

    public void agregar(int i){
        this.pila.push(i);
    }

    /**
     * Agrega los elementos de una PilaSofisticada a esta instancia.
     * @param p
     */
    public void agregar(PilaSofisticada p){
        Stack<Integer> otraPila = p.getPila();
        while(!otraPila.empty()){
            this.pila.add(otraPila.pop());
        }
    }

    /**
     * Intercala los valores de la PilaSofisticada con los de esta instancia
     * @param p
     * @return
     */
    public PilaSofisticada intercalar(PilaSofisticada p){
        PilaSofisticada pilaSofisticada = new PilaSofisticada();
        Stack<Integer> otraPila = p.getPila();
        while(!this.pila.empty() || !otraPila.empty()){
            if(!this.pila.empty()){
                pilaSofisticada.agregar(this.pila.pop());
            }
            if(!otraPila.empty()){
                pilaSofisticada.agregar(otraPila.pop());
            }
        }
        return pilaSofisticada;
    }

}
