package ejercicio4;

import java.util.Stack;

public class Solitario {

    private Stack<Carta> pilaCartas;

    public Solitario(){
        this.pilaCartas = new Stack<>();
    }

    public void apilar(Carta carta) throws ApilarEx{
        if(this.pilaCartas.empty() || this.pilaCartas.peek().getNumero() > carta.getNumero() && this.pilaCartas.peek().getPalo().equals(carta.getPalo())){
            this.pilaCartas.add(carta);
        }else {
            throw new ApilarEx();
        }
    }

    public String toString(){
        Carta[] aux = new Carta[this.pilaCartas.size()];
        String valores = "";
        for(int i = aux.length - 1; i >= 0 ; i--){
            aux[i] = this.pilaCartas.pop();
        }
        for(int i = 0; i < aux.length; i++){
            valores += aux[i].toString();
            if(i < aux.length - 1){
                valores += " -> ";
            }
            this.pilaCartas.add(aux[i]);
        }
        return valores;
    }
}
