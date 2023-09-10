package ru.mirea.lab1;

import java.util.Scanner;

public class Lab_1 {
    public static void main(String[] args) {
        //thirdPunkt();
        //fourPunkt();
        //fivePunkt(args);
        //sixPunkt();
        //System.out.println(seventPunktFactorial(3));
    }




    public static void thirdPunkt(){
        int[] mas = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for(int i = 0; i < mas.length; i++){
            sum += mas[i];
        }
        double average = sum / 10.0;
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее ар. элементов массива: " + average);
    }

    public static void fourPunkt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива:");
        int n = sc.nextInt();
        int[] mas = new int[n];
        System.out.println("Заполните массив числами");
        int i = 0;
        //заполняем массив
        do{
            mas[i] = sc.nextInt();
            i++;
        }while(n > i);
        int sum = 0, max = 0, min = 1000;
        int j = 0;
        while(j < n){
            sum += mas[j];
            if(max < mas[j]){
                max = mas[j];
            }
            if(min > mas[j]){
                min = mas[j];
            }
            j++;
        }
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент " + max);
        System.out.println("Минимальный элемент " + min);
    }


    public static void fivePunkt(String[] args){
        for(String x : args){
            System.out.println(x);
        }
    }

    public static void sixPunkt(){
        for(int i = 1; i <= 10; i++){
            System.out.println(i + " число : " + "1/" + i);
        }
    }

    public static long seventPunktFactorial(int f){
        long result = 1;
        for(int i = 1; i <= f; i++){
            result *= i;
        }
        return result;
    }

}
