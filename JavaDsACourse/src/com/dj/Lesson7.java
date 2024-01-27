package com.dj;

import java.util.Scanner;

public class Lesson7 {

    public static void main(String[] args) {

        //Scanner sc=new Scanner(System.in);
       // int n=sc.nextInt();
//        for(int row=1;row<=n;row++){
//
//            for(int space=0;space<row-1;space++){
//                System.out.print(" ");
//            }
//
//            for (int start=0;start<=n-row;start++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }



        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){

            for(int space=0;space<n-row;space++){
                System.out.print(" ");
            }

            for (int start=0;start<=row-1;start++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


}
