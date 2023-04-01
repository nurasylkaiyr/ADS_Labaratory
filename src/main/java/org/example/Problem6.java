package org.example;
import java.util.Scanner;
public class Problem6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(pow(a, n));
    }
    public static int pow(int a, int n){
        if(a == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        return a*pow(a, n-1);
    }
}
