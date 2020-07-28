package com.sbrf.demo;
import java.util.Scanner;

public class Task11
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        System.out.println((int)(Math.random()*((b+1)-a)+a));
    }
}
