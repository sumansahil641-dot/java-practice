package com.untitle;
import java.util.Scanner;
public class armstrong
{
    public static void main(String[] args)
    {
        long num1,count=0,ld,temp;
        long arm=0;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number: ");
        num1=obj.nextLong();
        temp=num1;
        while(temp>0)
         {
             temp=temp/10;
             count++;
         }
        temp=num1;
        while(temp>0)
        {
            ld=temp%10;
            arm= (long) (arm+Math.pow(ld, count));
            temp=temp/10;
        }
        if(num1 == arm )
        {
            System.out.print("Yes, it is an Armstrong number."+num1+ " = " +arm);
        }
        else
        {
            System.out.print("No, it is not."+num1+ " != " +arm);
        }
    }
}
