package org.example;
import java.util.Scanner;
public class Problem9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(bionomical(n, k));
    }
    public static int bionomical(int n, int k){
        if (k == 0){
            return 1;
        }
        if (k == n){
            return 1;
        }
        return bionomical(n-1, k-1)+bionomical(n-1, k);
    }
}
