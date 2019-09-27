package com.company;

import java.util.Scanner;

public class f3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        int a=(x%10)+(x/100)+((x%100)/10);
        System.out.println(a);
    }
}
