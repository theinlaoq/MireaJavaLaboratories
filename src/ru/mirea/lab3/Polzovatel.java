package ru.mirea.lab3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Polzovatel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = 0;
        while (sc.hasNext()){
            n = sc.nextInt();
            if(n > 20 || n < 0){
                System.out.println("не подходящее число");
            }else{
                break;
            }
        }
        Random rand = new Random();
        int[] randMas = new int[n];
        int countChet = 0;
        for(int i = 0; i < n;i++){
            randMas[i] = rand.nextInt(n + 1);
            if(randMas[i]%2==0){
                countChet++;
            }
        }
        System.out.println(Arrays.toString(randMas));
        int[] chetnie = new int[countChet];
        int j = 0;
        for(int i = 0; i < n; i++){
            if(randMas[i]%2==0){
                chetnie[j] = randMas[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(chetnie));

    }
}
