package com.mycompany.basicjava;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args)
    {
        Scanner x=new Scanner (System.in);
        int a;
        a=x.nextInt();
        if (a%4==0 && a%100!=0 && a%400==0)
        System.out.print("Leap Year");
        else
        System.out.print("Not Leap Year");
       
            
    }
    
}
