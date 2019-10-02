package com.company;

import java.util.Scanner;

public class Main {
   private double a,b,c;
public Main(){

}
public Main(double a,double b,double c){
    this.a=a;
    this.b=b;
    this.c=c;
}
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant() {
        return this.b*this.b - 4*this.a*this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(this.getDiscriminant())) / (2*this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(this.getDiscriminant())) / (2*this.a);
    }

    public static void main(String[] args) {
         Scanner reader= new Scanner(System.in);
        System.out.println("Quadratic equation: ax^2 + bx + c = 0");
        System.out.print("Input a: ");
        Double a = reader.nextDouble();
        System.out.print("Input b: ");
        Double b = reader.nextDouble();
        System.out.print("Input c: ");
        Double c = reader.nextDouble();

        Main qe = new Main(a, b, c);

        if (qe.getDiscriminant() > 0)
            System.out.println("The equation has two roots " + qe.getRoot1() + " and " + qe.getRoot2());
        else if (qe.getDiscriminant() == 0)
            System.out.println("The equation has one root " + qe.getRoot1());
        else
            System.out.println("The equation has no real root!");
    }
}
