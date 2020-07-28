package com.sbrf.demo;
import java.util.Scanner;

public class Task2
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        System.out.println(a/b);
        System.out.println(a-b*(a/b));
    }
}
