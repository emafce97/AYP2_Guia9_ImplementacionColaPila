package ejercicio3;

import excepcionespila.PilaVaciaEx;

public interface Queue<T> {

    boolean isEmpty();

    void enqueue(T newItem);

    T dequeue() throws PilaVaciaEx;

    T peek() throws PilaVaciaEx;

}
