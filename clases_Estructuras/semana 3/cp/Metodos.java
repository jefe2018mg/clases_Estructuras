/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cp;

import java.util.Scanner;

/**
 *
 * @author natsu
 */
public class Metodos {

    Scanner entrada;
    Nodo raiz;

    public Metodos() {
        this.raiz = null;
        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("[1] Insertar");
        System.out.println("[2] Recorrer");
        System.out.println("[3] Eliminar");
        System.out.println("[0] Salir");
        return entrada.nextInt();
    }

    public Nodo insertar(int v, Nodo actual) {
        if (actual == null) {
            Nodo nuevo = new Nodo(v);
            return nuevo;
        } else {
            if (v < actual.valor) {
                actual.izq = insertar(v, actual.izq);
            } else {
                actual.der = insertar(v, actual.der);
            }
        }
        return actual;
    }

    public void preOrden(Nodo actual) {
        if (actual != null) {
            System.out.println(actual.valor + "  ");
            preOrden(actual.izq);
            preOrden(actual.der);
        }
    }

    public void inOrden(Nodo actual) {
        if (actual != null) {
            inOrden(actual.izq);
            System.out.println(actual.valor + "  ");
            inOrden(actual.der);
        }
    }

    public void posOrden(Nodo actual) {
        if (actual != null) {
            posOrden(actual.izq);
            posOrden(actual.der);
            System.out.println(actual.valor + "  ");
        }
    }
}
