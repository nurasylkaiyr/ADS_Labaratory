/*
    @GCD() - method to find GCD(a, b)
    @a - integer value
    @b - integer value
    @return - returns GCD(a, b)
*/
package org.example;
import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(GCD(a, b)); // Output the greatest common divisor of a and b
    }
    public static int GCD(int a, int b){
        if(b == 0){ // If b equals to zero, return a
            return a;
        }
        return GCD(b, a%b); // Recursively call GCD with b and the remainder of a divided by b
    }
}