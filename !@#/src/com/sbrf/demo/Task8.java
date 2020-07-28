package com.sbrf.demo;
import java.util.Scanner;

public class Task8
{
    public static void main(String[] args)
    {
        int a;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        for(int i=(int)Math.sqrt(a);i>=1;i--)
        {
            if(a%i==0&i!=1)
            {
                System.out.println("составное");
                break;
            }
            if(i==1) System.out.println("простое");
        }

    }
}
