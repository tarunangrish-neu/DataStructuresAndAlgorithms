package Fundamentals;

import java.util.Random;

public class Fundamentals {

    static int[] histogram(int[] arr, int M){
        int result[] = new int[M];
        for(int i : arr){
            if(arr[i] < M){
                result[i] = result[i] + 1;
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] inputArray = {1, 2, 1, 3, 0, 2, 4, 1};
        int M = 5;

        int[] result = histogram(inputArray, M);

        System.out.println("Histogram array:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(i + ": " + result[i]);
        }
    }
}
