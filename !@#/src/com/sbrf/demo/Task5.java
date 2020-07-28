package com.sbrf.demo;
import java.util.Scanner;

public class Task5
{
    public static void main(String[] args)
    {
        int a,sum=0;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        while(a != 0)
        {
            sum += (a % 10);
            a/=10;
        }
        System.out.println(sum + " ");
    }
}
