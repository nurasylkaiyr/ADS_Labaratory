package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = findMin(n, arr);
        System.out.println(min);
    }
    public static int findMin(int n, int[] arr) {
        if(n==1)
            return arr[0];

        else{
            int min = findMin(n-1, arr);
            return Math.min(min, arr[n-1]);
        }
    }
}
