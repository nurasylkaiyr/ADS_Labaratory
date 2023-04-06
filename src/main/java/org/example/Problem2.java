/*
    @findAvg() - method to find average value of array recursively
    @arr - array of elements, where need to find average value
    @n - size of array
    @return - returns avg value of the recursive
 */

package org.example;
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        double avg = findAvg(n, arr);
        System.out.println(avg);
    }
    public static double findAvg(int n, int[] arr){
        if(n == 0){
            return 0;
        }
        else{
            double sum = findAvg(n-1, arr)*(n-1);
            sum += arr[n-1];
            return sum/n;
        }
    }
}
