package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Circle extends Shape {
    Scanner scan = new Scanner(System.in);
    private int circum;

    public int radius_find(){
        System.out.println("Do you want to find radius of this circle?");
        System.out.println("Enter 1 for yes and 0 for No");
        int radius_input = scan.nextInt();
        return radius_input;
    }

    public double circle_radius(int c) {
        this.circum = c;
        double r = circum / (2 * 3.14);
        return r;
    }
}
