package com.untitle;
import java.util.Scanner;
public class Bank
{
    private double bal=5000;
    double money;
    private int pwd=1608;
    int inputpwd;
    Scanner obj= new Scanner(System.in);
    void deposit()
    {
        System.out.print("Enter password: ");
        inputpwd=obj.nextInt();
        if(inputpwd==pwd)
        {
            System.out.print("Enter amount to deposit: ");
            money=obj.nextDouble();
            if(money>0)
            {
                bal=bal+money;
                System.out.println("Amount deposited: "+money);
                System.out.println("Total balance: "+bal);
            }
            else
            {
                System.out.println("Enter valid amount");
            }
        }
        else
        {
            System.out.println("Wrong password");
        }
    }
    void withdraw()
    {
        System.out.print("Enter password: ");
        inputpwd=obj.nextInt();
        if(inputpwd==pwd)
        {
            System.out.print("Enter amount to withdraw: ");
            money=obj.nextDouble();
            if(money>0)
            {
                if(money <= bal)
                {
                    bal = bal - money;
                    System.out.println("Amount withdrawn: " + money);
                    System.out.println("Available balance: " + bal);
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
            }
            else
            {
                System.out.println("Enter valid amount");
            }
        }
        else
        {
            System.out.println("Wrong password");
        }
    }
    void check()
    {
        System.out.print("Enter password: ");
        inputpwd=obj.nextInt();
        if(inputpwd==pwd)
        {
            System.out.println("Available balance: "+bal);
        }
        else
        {
            System.out.println("Wrong password");
        }
    }
    public static void main(String[] args)
    {
        int choice;
        Scanner obj= new Scanner(System.in);
        Bank b= new Bank();
        while(true)
        {
            System.out.println("==========ATM==========");
            System.out.println("Enter 1 to Deposit: ");
            System.out.println("Enter 2 to Withdraw: ");
            System.out.println("Enter 3 to Check balance: ");
            System.out.println("Enter 4 to Exit: ");
            System.out.print("Enter your Choice: ");
            choice=obj.nextInt();
            switch(choice)
            {
                case 1: b.deposit();
                    break;
                case 2: b.withdraw();
                    break;
                case 3: b.check();
                    break;
                case 4: System.out.println("Thank You");
                    return;
                default: System.out.println("Invalid choice");
            }
        }
    }
}
