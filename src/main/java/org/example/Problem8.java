/*
    @checkDigits() - method to check whether 's' is all consists of digits
    @s - string
    @return - returns 'true' if string is all consists of digits, 'false' otherwise
    @Character.isDigit - checks if the first character of s is a digit
    @isEmpty - checks if the input string s is empty
 */
package org.example;
import java.util.Scanner;
public class Problem8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (checkDigits(s)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    public static boolean checkDigits(String s) {
        if (s.isEmpty()) {
            return true;
        }
        if (Character.isDigit(s.charAt(0))) {
            return checkDigits(s.substring(1));
        }
        else {
            return false;
        }
    }
}
