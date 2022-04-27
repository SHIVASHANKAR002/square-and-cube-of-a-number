package com.packages;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float inp = 0.00F,inp1 = 0.00F;
        System.out.println("input number to calculate cube and square : ");
        inp = obj.nextFloat();
        inp1 = inp;
        inp = inp * inp;
        System.out.println("square : " + inp);
        inp1 = inp1 * inp1 * inp1;
        System.out.println("cube : " + inp1);
    }
}
