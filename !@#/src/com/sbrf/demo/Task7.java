package com.sbrf.demo;
import java.util.Scanner;

public class Task7
{
    public static void main(String[] args)
    {
        int a,b=0;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        for(int i=a;i>0;i--)
        {
            b = a%i;
            if(b==0)
                System.out.print(i+" ");
        }

    }
}
