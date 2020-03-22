package Pattern;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 2*i; j <= 2*n; j++) {
                if ( j % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 2; j <= 2*i; j++) {
                System.out.print(" ");
            }
            for (int j = 2; j <= 2*i; j++) {
                System.out.print(" ");
            }for (int j = 2*i; j <= 2*n; j++) {
                if ( j % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 2*i; j++) {
                if (j % 2 == 0) {
                    System.out.print("2");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 2*i; j <= 2*n; j++) {
                System.out.print(" ");
            }
            for (int j = 2*i; j < 2*n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i; j++) {
                if (j % 2 == 0) {
                    System.out.print("3");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}