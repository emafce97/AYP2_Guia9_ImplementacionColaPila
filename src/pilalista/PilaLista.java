package pilalista;

import excepcionespila.PilaVaciaEx;
import interfaces.PilaInterface;

import java.util.ArrayList;
import java.util.List;

public class PilaLista implements PilaInterface{

    private List<Integer> lista;

    public PilaLista(){
        this.lista = new ArrayList<>();
    }
    @Override
    public boolean estaVacia() {
        return this.lista.isEmpty();
    }

    @Override
    public void apilar(Integer nuevoElemento) {
        this.lista.add(nuevoElemento);
    }

    @Override
    public Integer desapilar() throws PilaVaciaEx {
        if(this.estaVacia()){
            throw new PilaVaciaEx();
        }else{
            return this.lista.removeLast();
        }
    }
    @Override
    public Integer obtenerTope() throws PilaVaciaEx {
        if(this.estaVacia()){
            throw new PilaVaciaEx();
        }else{
            return this.lista.getLast();
        }
    }

    public String toString(){
        String elementos = "[";
        for (int i = 0; i < this.lista.size(); i++) {
            elementos += STR."\{this.lista.get(i)}";
            if (i != this.lista.size() - 1) {
                elementos += ", ";
            }
        }
        return STR."\{elementos}]";
    }

}
