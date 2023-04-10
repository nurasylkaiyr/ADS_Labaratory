/*
    @reverse() - method to reverse order of given array
    @arr - array of elements
    @n - integer value
    @return - returns given array in reverse order
 */

package org.example;
import java.util.Scanner;
public class Problem7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // read the number of elements in the array from user input
        int[] arr = new int[n]; // create an array with n elements
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        reverse(arr, 0, n-1);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " "); // Print the reversed array
        }
    }
    public static void reverse(int[] arr, int a, int b){
        if(a >= b){ // if a >= b, the array is already reversed
            return;
        }
        // swap elements at a and b
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
        reverse(arr, a+1, b-1); // recursively reverse the remaining elements

    }
}
