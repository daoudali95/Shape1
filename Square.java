package com.company;

import java.util.Scanner;

public class Square extends Shape {
    private int length;

    public int area_find(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to find area of this square?");
        System.out.println("Enter 1 for yes and 0 for No");
        int area_input = scan.nextInt();
        return area_input;
    }

    public double square_area(int l){
        Scanner scan = new Scanner(System.in);
        this.length = l;
        return length*length;
    }

}
