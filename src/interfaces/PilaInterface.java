package interfaces;

import excepcionespila.PilaVaciaEx;

public interface PilaInterface {

        /**
         * Agrega un elemento en el tope de la pila
         */
        void apilar(Integer nuevoElemento);

        /**
         * Quita y retorna el ultimo valor de la pila
         */
        Integer desapilar() throws PilaVaciaEx;

        /**
         * Verifica si la pila esta vacia
         */
        boolean estaVacia();

        /**
         * Retorna el ultimo elemento de la pila
         */
        Integer obtenerTope() throws PilaVaciaEx;
}
