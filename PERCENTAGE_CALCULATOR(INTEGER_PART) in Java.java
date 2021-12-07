package com.company;

import java.util.Scanner;

public class Percentage_Calculator4 {
    public static void main(String[] args) {
        System.out.println("Subject 1 marks: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Subject 2 marks: ");
        int b = sc.nextInt();
        System.out.println("Subject 3 marks: ");
        int c = sc.nextInt();
        System.out.println("Subject 4 marks: ");
        int d = sc.nextInt();
        System.out.println("Subject 5 marks: ");
        int e = sc.nextInt();
        int sum = a+b+c+d+e;
        int Percentage = sum/50;
        System.out.print("Percentage is: ");
        System.out.println(Percentage);
    }
}
