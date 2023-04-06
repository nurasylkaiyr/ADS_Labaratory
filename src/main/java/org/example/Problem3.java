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
        int n = scanner.nextInt();
        if(checkPrime(n, 2)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Composite");
        }
    }
    public static boolean checkPrime(int n, int i){
        if(n <= 2){
            return (n == 2) ? true : false;
        }
        if(n % i == 0){
            return false;
        }
        if(i * i > n) {
            return true;
        }
        return checkPrime(n, i+1);
    }
}







