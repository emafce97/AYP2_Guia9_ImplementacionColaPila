package pilaconarreglo;

import ejercicio2.Pila;
import excepcionespila.PilaVaciaEx;
import interfaces.PilaInterface;

public class PilaArreglo implements PilaInterface {

    private int[] pila;
    private int cantElementos, ultimaPosicion;

    public PilaArreglo() {
        this.pila = new int[2];
        this.cantElementos = 0;
        this.ultimaPosicion = 0;
    }

    public void apilar(Integer i) {
        if (this.cantElementos == this.pila.length) {
            this.extenderPila();
        }
        this.pila[this.ultimaPosicion] = i;
        this.ultimaPosicion++;
        this.cantElementos++;
    }

    public Integer desapilar() throws PilaVaciaEx {
        if (this.ultimaPosicion - 1 >= 0) {
            int ultimoValor = this.pila[this.ultimaPosicion];
            this.pila[this.ultimaPosicion] = 0;
            this.ultimaPosicion--;
            this.cantElementos--;
            return ultimoValor;
        } else {
            throw new PilaVaciaEx();
        }
    }

    public Integer obtenerTope() throws PilaVaciaEx {
        if (this.estaVacia()) {
            throw new PilaVaciaEx();
        } else {
            return this.pila[this.cantElementos - 1];
        }
    }


    public boolean estaVacia() {
        return this.cantElementos == 0;
    }

    /**
     * Amplia el tamaño de la pila para seguir agregando elementos
     */
    private void extenderPila() {
        int[] pilaNueva = new int[this.pila.length * 2];
        for (int i = 0; i < this.pila.length; i++) {
            pilaNueva[i] = this.pila[i];
        }
        this.pila = pilaNueva;
    }

    public String toString() {
        String elementos = "[";
        for (int i = 0; i < this.cantElementos; i++) {
            elementos += STR."\{this.pila[i]}";
            if (i != this.cantElementos - 1) {
                elementos += ", ";
            }
        }
        return STR."\{elementos}]";
    }

}
