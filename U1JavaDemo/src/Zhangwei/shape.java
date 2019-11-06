package Zhangwei;

import java.text.DecimalFormat;
import java.util.Scanner;

abstract class shape {
    public abstract double getArea();

    public abstract double getPerimeter();
}

class RPentagon extends shape {
    private double a;

    @Override
    public double getArea() {
        return 5 * Math.pow(a, 2) / (4 * Math.tan(36 * (Math.PI / 180)));
    }

    @Override
    public double getPerimeter() {
        return 5 * a;
    }

    public RPentagon(double a1) {
        a = a1;
    }
}

// class Main {
//    public static void main(String[] args) {
//        DecimalFormat df = new DecimalFormat(".##");
//        Scanner in=new Scanner(System.in);
//        RPentagon r=new RPentagon(in.nextDouble());
//        System.out.println(df.format(r.getArea()));                                  System.out.println(df.format(r.getPerimeter()));                                         in.close();     } }
