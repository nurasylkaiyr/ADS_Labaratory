/*
    @seqFibonacci - method to find n-th elements in Fibonacci sequence using recursion
    @n - integer value
    @return - returns n-th element in Fibonacci sequence
 */
package org.example;
import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(seqFibonacci(n)); // Compute the nth number in the Fibonacci sequence.
    }
    public static int seqFibonacci(int n){
        if(n == 0){
            return 0; // if n is 0, the result is 0.
        }
        if(n == 1){
            return 1; // if n is 1, the result is 1.
        }
        return seqFibonacci(n-1)+seqFibonacci(n-2); // compute the (n-1)th and (n-2)th numbers in the Fibonacci sequence and add them together
    }
}
