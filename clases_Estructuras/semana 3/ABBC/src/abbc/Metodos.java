
package abbc;
import java.util.Scanner;
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
            System.out.print(actual.valor + "  ");
            preOrden(actual.izq);
            preOrden(actual.der);
        }
    }

    public void inOrden(Nodo actual) {
        if (actual != null) {
            inOrden(actual.izq);
            System.out.print(actual.valor + "  ");
            inOrden(actual.der);
        }
    }

    public void posOrden(Nodo actual) {
        if (actual != null) {
            posOrden(actual.izq);
            posOrden(actual.der);
            System.out.print(actual.valor + "  ");
        }
    }
}
