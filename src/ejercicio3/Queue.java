package ejercicio3;

public interface Queue<T>{

    public boolean isEmpty();

    public void enqueue(T newItem);

    public T dequeue() throws PilaVaciaEx;


    public T peek() throws PilaVaciaEx;

}
