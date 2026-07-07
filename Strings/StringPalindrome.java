package com.untitle;

public class namepalindrome
{
    public static void main(String[] args)
    {
        String name = "MADAM";
        name = name.toLowerCase();
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--)
        {
            reverse = reverse + name.charAt(i);
        }
        System.out.println(reverse);
        if (reverse.equals(name))
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
    }
}
