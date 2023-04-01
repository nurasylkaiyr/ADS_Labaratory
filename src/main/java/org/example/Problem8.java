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
