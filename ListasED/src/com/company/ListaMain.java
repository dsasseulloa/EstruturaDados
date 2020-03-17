package com.company;

public class ListaMain {
    public static void main(String[] args) {

        Lista lista = new Lista();
        lista.Insere(9);
        lista.Insere(3);
        lista.Insere(2);
        lista.Insere(5);
        lista.Imprime();
        System.out.print("\nlista tostring: ");
        System.out.println(lista.toString());
        System.out.println("Lista vazia? "+lista.vazia());
        System.out.println("Nó na lista: "+lista.busca(9));
        System.out.println("Comprimento da lista: "+lista.comprimento()+ " números");
        System.out.println("Ultimo num da lista: "+lista.ultimo());


    }
}
