package org.example;

public class Rectangle {

    private double length =0;
    private double breadth=0;

    public  Rectangle(double len ,double bre){

        this.breadth = bre;
        this.length = len;

    }
    public double area(){
        return  length*breadth;

    }
    public double perimeter(){
        return  (length+breadth) * 2;

    }
}
