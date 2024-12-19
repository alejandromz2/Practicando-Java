package com.paquete.DSA_GT1;

public class BaseCase {
    public static String recursiveMethod(int n) {
        if (n == 10) {
            return "n==10";
        } else if (n == 0) {
            return "n==0";
        } else if (n == 11) {
            return "n==11";
        } else if (n == -1) {
            return "n==-1";
        } else if (n == 9) {
            return "n==9";
        } else if (n == 2) {
            return "n==2";
        } else {
            if (n <= 5) {
                recursiveMethod(n - 2);
            }
            System.out.println(n);
            if (n > 5) {
                recursiveMethod(n + 2);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(recursiveMethod(12));
    }
}


