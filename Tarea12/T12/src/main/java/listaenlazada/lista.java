/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazada;

/**
 *
 * @author Iris Damian
 */
public class lista {
    private nodo cima;

    public lista() {
        cima = null;
    }

    public boolean pilaVacia() {
        return cima == null;
    }

    public void insertar(Object elemento) {
        nodo nuevo;
        nuevo = new nodo(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public Object quitar() throws Exception {
        if (pilaVacia()) {
            throw new Exception("Pila vacia");
        }
        Object aux = cima.elemento;
        cima = cima.siguiente;
        return aux;
    }

    public Object cimaPila() throws Exception {
        if (pilaVacia()) {
            throw new Exception("No es posible leer");
        }
        return cima.elemento;
    }

    public void limpiarPila() {
        nodo t;
        while (!pilaVacia()) {
            t = cima;
            cima = cima.siguiente;
            t.siguiente = null;
        }
    }
}
