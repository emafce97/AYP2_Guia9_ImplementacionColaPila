package ejercicio3;

import java.util.*;
public class Cola implements Queue<Integer> {

    private Stack<Integer> a, b;

    public Cola(){
        this.a = new Stack<>();
        this.b = new Stack<>();
    }

    /**
     * Verifica si la cola esta vacia
     * @return
     */
    @Override
    public boolean isEmpty() {
        return this.a.empty();
    }

    /**
     * Agrega un elemento
     * @param newItem
     */
    @Override
    public void enqueue(Integer newItem) {
        this.a.push(newItem);
        this.b.push(newItem);
    }

    /**
     * Quita un elemento
     * @return
     */
    @Override
    public Integer dequeue() throws PilaVaciaEx {
        if(this.b.empty()){
            this.desarmar();
        }
        return this.b.pop();
    }

    /**
     * Se obtiene el ultimo valor cargado
     * @return
     * @throws PilaVaciaEx
     */
    @Override
    public Integer peek() throws PilaVaciaEx {
        if(this.a.empty()){
            throw new PilaVaciaEx();
        }else{
            return this.a.peek();
        }
    }

    private void desarmar() throws PilaVaciaEx{
        if(this.a.empty()){
            throw new PilaVaciaEx();
        }else{
            while(!this.a.empty()){
                this.b.push(this.a.pop());
            }
        }
    }


}
