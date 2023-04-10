/*
    @pow() - method that find n degree of a
    @a - integer value
    @n - power value
    @return - returns n degree of a
 */
package org.example;
import java.util.Scanner;
public class Problem6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // read in the input integer from the user
        int n = scanner.nextInt(); // read in the input integer from the user
        System.out.println(pow(a, n)); //print the value of 'a' to the power of 'n'
    }
    public static int pow(int a, int n){
        if(a == 0){
            return 0; // if a is 0, then the result is 0
        }
        if(n == 0){
            return 1; // if n is 0, then the result is 1
        }
        return a*pow(a, n-1); // compute a^(n-1) and multiply by a
    }
}
