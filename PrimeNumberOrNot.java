package com.mycompany.basicjava;
import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args)
    {
    Scanner x=new Scanner(System.in);
    System.out.print("Enter number : ");
    int a,i=0,n;
    a=x.nextInt();
    for (n=1;n<=a;n++)
    {
    if (a%n==0)
        i++;
    }
    if (i==2)
        System.out.print("The number is Prime");
    else
        System.out.print("The number is not Prime");
    }
    
}
