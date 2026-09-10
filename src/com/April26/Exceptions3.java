package com.April26;

import java.util.InputMismatchException;
import java.util.Scanner;

class Demo1 {
    void alpha() {
        try {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the first integer value");
            int a = scan.nextInt();

            System.out.println("Enter the second integer value");
            int b = scan.nextInt();

            System.out.println("add = " + (a + b));
            System.out.println("sub = " + (a - b));
            System.out.println("multi = " + (a * b));
            System.out.println("div = " + (a / b));
        } 
        catch (InputMismatchException e) {
            System.out.println("enter a integer value");
        }
        catch (ArithmeticException f) {
            System.out.println("Some problem");
        }
        catch (Exception g) {
            System.out.println("Some problem");
        }
    }
}

class Demo2 {
    void gamma() {
        Demo1 d1 = new Demo1();
        d1.alpha();
        System.out.println("connection3");
    }
}

class Demo3 {
    void gamma() {
        Demo2 d2 = new Demo2();
        d2.gamma();
        System.out.println("connection2");
    }
}

public class Exceptions3 {
    public static void main(String[] args) {
        Demo3 d3 = new Demo3();
        d3.gamma();
        System.out.println("connection 1");
    }
}