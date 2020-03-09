package com.company;

import java.util.Arrays;

public class TesteOrdenacao {
    public static void main(String[] args) {

        //BubbleSort
        for (int i = 0; i < 4 ; i++) {
            int v[]= Ordenacao.criaVetorEmbaralhado((int)(Math.pow(10,i+1)));
            System.out.print("BubbleSort de array com "+v.length+" número ");
            Ordenacao.Bubblesort(v);
        }


        System.out.println("---------------------------------");
        //QuickSort
        for (int i = 0; i < 4 ; i++) {
            int v[]= Ordenacao.criaVetorEmbaralhado((int)(Math.pow(10,i+1)));
            System.out.print("QuickSort de array com "+v.length+" número ");
            Ordenacao.TempoQuickSort(v,0,v.length-1);
        }


        System.out.println("---------------------------------");
        //MergeSort
        for (int i = 0; i < 4 ; i++) {
            int v[]= Ordenacao.criaVetorEmbaralhado((int)(Math.pow(10,i+1)));
            System.out.print("MergeSort de array com "+v.length+" número ");
            Ordenacao.TempoQuickSort(v,0,v.length-1);
        }

    }



}
