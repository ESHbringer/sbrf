package com.sbrf.demo;
import java.util.Scanner;

public class Task10
{
    public static void main(String[] args)
    {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        long a = 1;
        long b = 1;
        System.out.println("0 \n1 ");
        for (int i=3; i < n; i++)
        {
            long c = a+b;
            System.out.println(c + " ");
            a=b;
            b=c;
        }
    }
}
