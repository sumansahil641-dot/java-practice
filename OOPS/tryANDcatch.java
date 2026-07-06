package com.untitle;
import java.util.Scanner;
public class handle
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter value of a: ");
        a=obj.nextInt();
        System.out.println("Enter value of b: ");
        b=obj.nextInt();
        try
        {
            c=a/b;
            System.out.println("Result= "+c);
        }
        catch (ArithmeticException e)
       {
            System.out.println("Error: Division by zero is not allowed.");
            System.out.println(e);
       } 
    }
}
