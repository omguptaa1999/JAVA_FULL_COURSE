package com.company;

public class DataTypeOfExpression_and_IncrementOrDecrementOperator8 {
    public static void main(String[] args) {
//        byte x = 5;
//        int y = 6;
//        short z = 8;
//        int a = y+z;
//        float b = 6.54f +x;
//        System.out.println(b);

//        Increment & Decrement Operators :-
        int i = 56;
        int b = i++; // first b is assigned to i(56) then i is incremented...
        int j = 67;
        int c = ++j; // first j is incremented then c is assigned to j(68)...
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(b);
        int y =7;
        System.out.println(++y *8);
        char ch = 'a';
        System.out.println(++ch);



    }
}
