/*
   @findMin() - method to find the minimum integer in the array recursively
   @arr - array of elements, where need to find min
   @n - the number of elements in the array
   @return - returns min value of the recursive and the last element of array
*/
package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // read the number of elements in the array from user input
        int[] arr = new int[n]; // create an array with n elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = findMin(n, arr);  // find the minimum integer in the array using the findMin method
        System.out.println(min);
    }

    public static int findMin(int n, int[] arr) {
        if(n==1) // if there is only one element in the array, return that element as the minimum integer
            return arr[0];

        else{
            int min = findMin(n-1, arr); // recursively find the minimum integer in the first n-1 elements of the array
            return Math.min(min, arr[n-1]); // compare the minimum integer found in the first n-1 elements to the last element in the array and return the smaller integer as the minimum
        }
    }
}
