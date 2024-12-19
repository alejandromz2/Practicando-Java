package com.paquete.DSA_GT1;

public class Pastbyvalue {
    public static void main(String[] args) {
        Container count = new Container(0);
        helper(count);
        System.out.println(count.getItem());
    }

    public static void helper(Container x){
        x.setItem(x.getItem()+1);
    }
}

