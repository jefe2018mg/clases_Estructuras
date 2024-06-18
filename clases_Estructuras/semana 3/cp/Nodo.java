/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cp;

/**
 *
 * @author natsu
 */
public class Nodo {

    int valor;
    Nodo izq;
    Nodo der;

    public Nodo(int v) {
        this.valor = v;
        this.izq = null;
        this.der = null;
    }
}
