package com.company;

import java.util.Scanner;

public class Rectangle extends Shape{
    private int length;
    private int width;

    public int area_find(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to find area of this rectangle?");
        System.out.println("Enter 1 for yes and 0 for No");
        int area_input = scan.nextInt();
        return area_input;
    }

    public double rectangle_area(int l, int w){
        Scanner scan = new Scanner(System.in);
        this.length = l;
        this.width = w;
        return length*width;
    }
}
