package com.paquete.DSA_GT1;

public class Ejemplo1 {

    public static void main(String[] args) {

        Container count = new Container(0);
        helper(count);
        System.out.println(count.getItem());
        Object object = new Object();
        object.equals(object);
    }
    public static void helper(Container x){
        x = new Container(x.getItem()+1) ;
    }

}


class Container {
    private int item;

    public Container(int item) {
        this.item = item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getItem() {
        return item;
    }
}
