package ejercicio2;

import java.util.Objects;
import java.util.Stack;

public class Pila{

    private Stack<Integer> miPila;

    public Pila(){
        this.miPila = new Stack<>();
    }

    public Pila(Integer... valores){
        this.miPila = new Stack<>();
        for(Integer i : valores){
            this.miPila.push(i);
        }
    }

    public void agregar(Integer i){
        this.miPila.push(i);
    }

    public Integer quitar(){
        return this.miPila.pop();
    }

    public boolean estaVacia(){
        return this.miPila.empty();
    }

    public Integer consultarUltimoElemento(){
        return this.miPila.peek();
    }

    public Stack<Integer> obtenerPila(){
        return this.miPila;
    }

    public void actualizarPila(Stack<Integer> pila){
        this.miPila = pila;
    }

    public boolean esIgual(Pila otra){
        if(this.miPila.size() != otra.obtenerPila().size()){
            return false;
        }else{
            Stack<Integer> otraPila = otra.obtenerPila();
            Stack<Integer> auxMiPila = new Stack<>();
            Stack<Integer> auxOtraPila = new Stack<>();
            while(!this.miPila.empty()){
                auxMiPila.add(this.miPila.pop());
                auxOtraPila.add(otraPila.pop());
                if(!Objects.equals(auxMiPila.peek(), auxOtraPila.peek())){
                    return false;
                }
            }
            this.miPila = auxMiPila;
            otra.actualizarPila(auxOtraPila);
            return true;
        }
    }

}
