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
        System.out.println(seqFibonacci(n));
    }
    public static int seqFibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return seqFibonacci(n-1)+seqFibonacci(n-2);
    }
}
