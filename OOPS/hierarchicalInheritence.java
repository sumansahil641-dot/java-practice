package com.untitle;
import java.util.Scanner;
class parents
{
    String fname;
    String mname;
    Scanner obj= new Scanner(System.in);
    void inputparents()
    {
        System.out.print("Enter Father's Name: ");
        fname=obj.nextLine();
        System.out.print("Enter Mother's Name: ");
        mname=obj.nextLine();
    }
    void showparents()
    {
        System.out.println("Father's Name: "+fname);
        System.out.println("Mother's Name: "+mname);
    }
}
class son extends parents
{
    String sname;
    int sage;
    void inputson()
    {
        System.out.print("Enter Son's Name: ");
        sname=obj.nextLine();
        System.out.print("Enter Son's Age: ");
        sage=obj.nextInt();
    }
    void showson()
    {
        System.out.println("Son's Name: "+sname);
        System.out.println("Son's Age: "+sage);
    }
}
class daughter extends parents
{
    String dname;
    int dage;
    void inputdaughter()
    {
        System.out.print("Enter Daughter's Name: ");
        dname=obj.nextLine();
        System.out.print("Enter Daughter's Age: ");
        dage=obj.nextInt();
    }
    void showdaughter()
    {
        System.out.println("Daughter's Name: "+dname);
        System.out.println("Daughter's Age: "+dage);
    }
}
public class hierarchical2
{
    public static void main(String args[])
    {
        son s1= new son();
        daughter d1= new daughter();
        System.out.println("Input Son's Details");
        s1.inputparents();
        s1.inputson();
        System.out.println("Son's Details");
        s1.showparents();
        s1.showson();
        System.out.println("Input Daughter's Details");
        d1.inputparents();
        d1.inputdaughter();
        System.out.println("Daughter's Details");
        d1.showparents();
        d1.showdaughter();
    }
}
