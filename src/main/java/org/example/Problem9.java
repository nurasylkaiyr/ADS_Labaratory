/*
    @binomial() - method to find binomial coefficient
    @k - integer value
    @n - integer value
    @return - returns binomial coefficients
*/
package org.example;
import java.util.Scanner;
public class Problem9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(binomial(n, k)); // Calls the binomial function to calculate the binomial coefficient and prints the result
    }
    public static int binomial(int n, int k){
        if (k == 0){ // if k is 0, return 1
            return 1;
        }
        if (k == n){ //  if k is equal to n, return 1
            return 1;
        }
        // compute the binomial coefficient using the formula and call binomial recursively for smaller values
        return binomial(n-1, k-1)+binomial(n-1, k);

    }
}
