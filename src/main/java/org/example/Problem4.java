/*
    @findFactorial() - method to find factorial of n value
    @n - integer value
    @return -returns n times n-1
 */

package org.example;
import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // read in the input integer from the user
        System.out.println(findFactorial(n)); // print the factorial of n
    }
    public static int findFactorial(int n){
        if(n == 1){
            return 1; //if n is 1, return 1
        }
        else{
            return n*findFactorial(n-1);  // recursive case: compute n * (n-1) factorial
        }
    }
}
