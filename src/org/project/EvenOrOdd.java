package org.project;

import java.util.Scanner;

public class EvenOrOdd {

static boolean EvenOrOdd(int a){
    return (a%2==0);
}
       public static void main(String[] args){
           Scanner scan = new Scanner(System.in);
           System.out.println( "Enter youre value");
           int a = scan.nextInt();
        System.out.println( EvenOrOdd(a) );
    }
}



