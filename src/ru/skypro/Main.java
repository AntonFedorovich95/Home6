package ru.skypro;

public class Main {

    public static void main(String[] args) {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
            }
        System.out.println();
        int[] arr = generateRandomArray();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            System.out.println(arr[i]);
        }
        for (int i : arr) {
            sum += i;
        }
        System.out.print("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println();
        int maxarr = 100000;
        int minarr = 200000;
        for (int j : arr) {
            if (j > maxarr) {
                maxarr = j;
            }
            if (j < minarr) {
                minarr = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minarr + " рублей. Максимальная сумма трат за день составила " + maxarr + " рублей.");
        float sum1 = 0;
        for (int i : arr) {
            sum1 += i;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum1 / arr.length + " рублей.");
        return arr;
    }
}