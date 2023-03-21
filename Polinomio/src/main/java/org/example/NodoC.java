package org.example;

public class NodoC implements Nodo {
    public DatoPolinomio dato;
    public Nodo sig;

    public NodoC(DatoPolinomio dato) {
        this.dato = dato;
        this.sig = null;
    }

    public DatoPolinomio getDato() {
        return dato;
    }

    public Nodo getSig() {
        return sig;
    }


    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}

