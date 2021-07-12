package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Shape {
    public List<String> Color(){
        Scanner scan = new Scanner(System.in);
        String[] colors = {" ","Red","Blue","Green","Grey","White","Black","Purple","Yellow"};
        List<String> color_list = new ArrayList<String>();
        for (int i=1; i<colors.length; i++){
            System.out.print(i +")"+colors[i]+"  ");
        }
        System.out.println();
        System.out.println("Enter the color you want to add or enter 0 for exit");
        for (int i=0; i<colors.length; i++) {
            int color_input = scan.nextInt();
            if (color_input == 0) {
                break;
            }
            else {
                System.out.println(colors[color_input] + " Selected");
                color_list.add(colors[color_input]);
            }
        }
        return color_list;
    }
}
