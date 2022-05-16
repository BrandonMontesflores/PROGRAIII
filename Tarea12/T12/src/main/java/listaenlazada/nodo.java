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
public class nodo {
    Object elemento;
    nodo siguiente;

    nodo(Object element) {
        elemento = element;
        siguiente = null;
    }
}
