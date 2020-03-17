package com.company;

class NoLista {
    private int info;
    private NoLista prox;

    public void setInfo(int info){
        this.info=info;
    }
    public int getInfo(){
        return this.info;
    }
    public void setProx(NoLista prox){
        this.prox=prox;
    }
    public NoLista getProx(){
        return this.prox;
    }
    public String toString(){
        return (getInfo() + " ");
    }

}

public class Lista {
    public Lista() {
    }

    private NoLista prim;

    public void Insere(int info) {
        NoLista no = new NoLista();
        no.setInfo(info);
        no.setProx(this.prim);
        this.prim = no;
    }

    public void Imprime() {
        NoLista p = this.prim;
        while (p != null) {
            System.out.print(p.getInfo()+" ");
            p = p.getProx();
        }

    }

    public String toString() {
        NoLista p = this.prim;
        String listastring = "";
        while (p != null){
            System.out.print(p.getInfo()+" ");
            p=p.getProx();
        }
        return listastring;
    }

    public boolean vazia() {
        if (this.prim == null) {
            return true;
        } else {
            return false;
        }
    }

    public NoLista busca(int v) {
        NoLista p = this.prim;
        while (p != null) {
            if (p.getInfo() == v) {
                return p;
            }
            p = p.getProx();
        }
        return null;
    }

    public int comprimento() {
        NoLista p = this.prim;
        int contador = 0;
        while (p != null) {
            contador++;
            p = p.getProx();
        }
        return contador;
    }

    public NoLista ultimo() {
        NoLista p = prim;
        NoLista ant = null;
        int contador = 0;
        while (p != null) {
            int res = p.getInfo();
            ant=p;
            p=p.getProx();

        }
        return ant;
    }
}