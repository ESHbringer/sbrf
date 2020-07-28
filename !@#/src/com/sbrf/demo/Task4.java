package com.sbrf.demo;
import java.util.Scanner;

public class Task4 
{
    public static void main(String[] args) 
    {
        String  a;
        Boolean b=true;
        Scanner in = new Scanner(System.in);
        a = in.nextLine();
        for (int i = 0; i < a.length()/2; i++)
        {
            if (a.charAt(i) != a.charAt(a.length() - i - 1))
            {
                System.out.println("Не палиндром");
                b=false;
                break;
            }
        }
        if(b)
            System.out.println("Палиндром");
    } 
}
