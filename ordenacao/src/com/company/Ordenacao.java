package com.company;

import java.util.Arrays;
import java.util.Random;


public class Ordenacao {

    static void Bubblesort(int v[]){
        long tempoInicial = System.nanoTime();

        int n = v.length;
        for (int i =n-1; i >=0 ; i--) {
            for (int j = 0; j < i ; j++) {
                if(v[j]>v[j+1]){
                    int temp = v[j];
                    v[j]=v[j+1];
                    v[j+1]=temp;
                }
            }
        }
        long tempoFinal = System.nanoTime();
        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ns(nanosegundos)");
    }

    static void TempoQuickSort(int[] vetor, int inicio, int fim){
        long tempoInicial = System.nanoTime();
        QuickSort(vetor,inicio, fim);
        long tempoFinal = System.nanoTime();
        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ns(nanosegundos)");
    }

    static void QuickSort(int[] vetor, int inicio, int fim) {

        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim);
            QuickSort(vetor, inicio, posicaoPivo - 1);
            QuickSort(vetor, posicaoPivo + 1, fim);
        }

    }

    private static int separar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vetor[i] <= pivo)
                i++;
            else if (pivo < vetor[f])
                f--;
            else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }


    static void merge(int arr[], int l, int m, int r)
    {

        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int [n1];
        int R[] = new int [n2];

        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static void TempoMergeSort(int arr[], int l, int r){
        long tempoInicial = System.nanoTime();
        MergeSort(arr,l,r);
        long tempoFinal = System.nanoTime();
        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ns(nanosegundos)");
    }
    static void MergeSort(int arr[], int l, int r)
    {
        if (l < r)
        {
            int m = (l+r)/2;

            MergeSort(arr, l, m);
            MergeSort(arr , m+1, r);

            merge(arr, l, m, r);
        }
    }


    static int[] criaVetorEmbaralhado(int n){
            Random n_aleatorio = new Random();
            //int aleatorio = n_aleatorio.nextInt(10);

            int v[] = new int[n];

            for (int i = 0; i < n; i++) {
                v[i]=i;
            }

            for (int i = 0; i < n ; i++) {
                int j = n_aleatorio.nextInt(n);
                int temp = v[i];
                v[i] = v[j];
                v[j]=temp;
            }
        return v;
        }

}
