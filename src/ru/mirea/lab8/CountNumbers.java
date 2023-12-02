package ru.mirea.lab8;

public class CountNumbers {
    public static int countNumbersWithDigitSum(int k, int s) {
        if (k == 0) {
            return (s == 0) ? 1 : 0;
        }

        int count = 0;
        for (int i = 1; i <= 9; i++) {
            if (s - i >= 0) {
                count += countNumbersWithDigitSum(k - 1, s - i);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int k = 3;
        int s = 15;
        int result = countNumbersWithDigitSum(k, s);
        System.out.println("Количество " + k + "-значных чисел с суммой цифр " + s + ": " + result);
    }
}

