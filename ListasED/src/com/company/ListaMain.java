package com.company;

public class ListaMain {
    public static void main(String[] args) {

        Lista lista = new Lista();
        Lista lista2 = new Lista();
        Lista lista3 = new Lista();
        lista.Insere(9);
        lista.Insere(3);
        lista.Insere(2);
        lista.Insere(5);
        System.out.println("Lista: ");
        lista.Imprime();
//        System.out.print("\nlista tostring: ");
//        System.out.println(lista.toString());
//        System.out.println("Lista vazia? "+lista.vazia());
//        System.out.println("Nó na lista: "+lista.busca(9));
//        System.out.println("Comprimento da lista: "+lista.comprimento()+ " números");
//        System.out.println("Ultimo num da lista: "+lista.ultimo());
        System.out.println("\nRetira 3:");
        lista.retira(3);
        lista.Imprime();
        lista.libera();
        System.out.println("\nLibera:");
        lista.Imprime();
        System.out.println("vazio");
        System.out.println("\ninserçao de ordenados: 10,12,11,9");
        lista.insereOrdenado(10);
        lista.insereOrdenado(12);
        lista.insereOrdenado(11);
        lista.insereOrdenado(9);
        System.out.println("impressão recursiva:");
        lista.imprimeRecursivo();
        System.out.println("\nretirar recursivamente: 9");
        lista.retiraRecursivo(9);
        lista.imprimeRecursivo();

        System.out.println("\n\nCriaçao de lista2 e lista3:");
        System.out.print("\nLista: ");
        lista.imprimeRecursivo();
        System.out.print("\n\nLista2: ");
        lista2.insereOrdenado(10);
        lista2.insereOrdenado(12);
        lista2.insereOrdenado(11);
        lista2.imprimeRecursivo();
        System.out.println("\nComparaçao de da lista com lista2: ");
        System.out.println(lista.igualRecursivo(lista2));

        System.out.print("\nLista3: ");
        lista3.insereOrdenado(10);
        lista3.insereOrdenado(12);
        lista3.insereOrdenado(14);
        lista3.imprimeRecursivo();
        System.out.println("\nComparaçao de da lista com lista3: ");
        System.out.println(lista.igualRecursivo(lista3));

    }
}
