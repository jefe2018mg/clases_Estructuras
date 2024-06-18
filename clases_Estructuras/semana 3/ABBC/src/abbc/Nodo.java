package abbc;
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
