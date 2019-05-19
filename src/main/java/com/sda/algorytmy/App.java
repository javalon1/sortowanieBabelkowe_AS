package com.sda.algorytmy;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

import java.util.Arrays;
import java.util.Random;

/**
 * Hello world!
 */
public class App {
    public static int[] sort(int[] tab) {

        int counter=0;

        for (int j = 0; j < tab.length - 1; j++) {

            for (int i = 0; i < tab.length - 1; i++) { //-1 bo nie mozemy
                //sie iterowac z ostatnim miejscem w tablicy, bo nie ma
                //juz kolejnego elementu.
                if (tab[i] > tab[i + 1]) {// zamien miejscami
                    int tmp = tab[i + 1]; //zmienna pomocnicza
                    tab[i + 1] = tab[i];
                    tab[i] = tmp;
                }
                counter++;
            }
        }
        System.out.println(Arrays.toString(tab));
        System.out.println("counter: "+counter);

        return tab;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] tab = new int[10];
        int max = 5000;
        int min = -5000;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(max - min + 1) + min;

            System.out.println(tab[i] + " ");
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("czas wykonania: " + totalTime);
        startTime = System.currentTimeMillis();
        sort(tab);
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("czas sortowania: " + totalTime);


    }
}
