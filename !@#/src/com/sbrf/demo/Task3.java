package com.sbrf.demo;
import java.util.Scanner;

public class Task3
{
    public static void main(String[] args)
    {
        boolean a,b;
        Scanner in = new Scanner(System.in);
        System.out.println("weekday?");
        a = in.nextBoolean();
        System.out.println("vocation?");
        b = in.nextBoolean();
        if(a||b)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
