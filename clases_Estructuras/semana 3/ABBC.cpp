#include <iostream>
#include <conio.h>
#include <stdlib.h>
using namespace std;

struct Nodo {
    int valor;
    struct Nodo *izq;
    struct Nodo *der;
};

struct Nodo *raiz = NULL;

Nodo* crearNodo(int _valor) {
    Nodo *nuevo = new Nodo;
    nuevo->valor = _valor;
    nuevo->izq = NULL;
    nuevo->der = NULL;
    return nuevo;
}

void insertar(int _valor, Nodo** actual) {
    if (*actual == NULL)
        *actual = crearNodo(_valor);
    else if (_valor < (*actual)->valor)
        insertar(_valor, &((*actual)->izq));
    else
        insertar(_valor, &((*actual)->der));
}

void preOrden(Nodo *actual) {
    if (actual != NULL) {
        cout << actual->valor << "  ";
        preOrden(actual->izq);
        preOrden(actual->der);
    }
}

void posOrden(Nodo *actual) {
    if (actual != NULL) {
        posOrden(actual->izq);
        posOrden(actual->der);
        cout << actual->valor << "  ";
    }
}

void inOrden(Nodo *actual) {
    if (actual != NULL) {
        inOrden(actual->izq);
        cout << actual->valor << "  ";
        inOrden(actual->der);
    }
}

int main() {
    int opc, num;
    do {
        cout << "[1] Insertar" << endl;
        cout << "[2] Recorrer" << endl;
        cout << "[0] Salir" << endl;
        cin >> opc;
        switch (opc) {
            case 1:
                cout << "Digite elemento: ";
                cin >> num;
                insertar(num, &raiz);
                break;
            case 2:
                preOrden(raiz);
                cout << endl;
                inOrden(raiz);
                cout << endl;
                posOrden(raiz);
                cout << endl;
                break;
        }
    } while (opc != 0);

    return 0;
}

