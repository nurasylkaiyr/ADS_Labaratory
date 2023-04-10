/*
    @checkPrime() - method to check if it's prime
    @n - integer number
    @return - returns 'true' if it's prime, 'false' otherwise
 */
package org.example;
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // read in the input integer from the user.
        if(checkPrime(n, 2)){   // check if n is prime using the checkPrime method
            System.out.println("Prime");    // if n is prime, print "Prime"
        }
        else{
            System.out.println("Composite");    // if n is composite, print "Composite"
        }
    }
    public static boolean checkPrime(int n, int i){
        if(n <= 2){
            return (n == 2) ? true : false; //n is primal if n equal to 2; n is composite if n less than 2
        }
        if(n % i == 0){
            return false;   // if n is divisible by i, it is composite
        }
        if(i * i > n) {
            return true;    // if i*i is greater than n, n is prime
        }
        return checkPrime(n, i+1);  // recursively check if n is divisible by the next integer
    }
}







