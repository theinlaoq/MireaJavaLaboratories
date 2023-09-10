package ru.mirea.lab3;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        //randomByRandom();
        //randomByMath();

    }

    public static void randomByMath(){
        int[] randMas = new int[15];
        for(int i = 0; i < randMas.length; i++){
            randMas[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(randMas));
        bubbleSort(randMas);
        System.out.println(Arrays.toString(randMas));
    }

    public static void randomByRandom(){
        Random rand = new Random();
        int[] randMas = new int[15];
        for(int i = 0; i < randMas.length; i++){
            randMas[i] = rand.nextInt(999);
        }
        System.out.println(Arrays.toString(randMas));

        bubbleSort(randMas);
        System.out.println(Arrays.toString(randMas));


    }

    public static void bubbleSort(int[] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 1; j < a.length - i; j++){
                if(a[j - 1] > a[j]){
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

}
