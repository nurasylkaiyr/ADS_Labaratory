/*
    @findAvg() - method to find average value of array recursively
    @arr - array of elements, where need to find average value
    @n - the number of elements in the array
    @return - returns avg integers of the array
 */

package org.example;
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // read the number of elements in the array from user input
        int[] arr = new int[n]; // create an array with n elements
        for(int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        double avg = findAvg(n, arr);   // compute the average of the integers in the array using the findAvg method
        System.out.println(avg); // print the average value
    }
    public static double findAvg(int n, int[] arr){
        if(n == 0){ //if the array is empty, the average is 0
            return 0;
        }
        else{
            double sum = findAvg(n-1, arr)*(n-1);   // recursively compute the sum of the first n-1 elements of the array
            sum += arr[n-1];    // add the last element of the array to the sum
            return sum/n;   // compute the average of the entire array and return it
        }
    }
}
