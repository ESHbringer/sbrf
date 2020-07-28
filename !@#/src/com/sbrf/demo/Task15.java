package com.sbrf.demo;
import java.util.Scanner;

public class Task15
{
    public static void main(String[] args)
    {
        float a,b,c;
        Scanner in = new Scanner(System.in);
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();
        double d=(b*b)-(4*a*c);
        float e=0;
        float f=0;
        if(d==0)
        {
            e=-1*(b/(2*a));
            System.out.println(e);
        }
        else
            {
            if(d>0)
            {
                e=((-1*b)+(float)Math.sqrt(d))/(2*a);
                f=((-1*b)-(float)Math.sqrt(d))/(2*a);
                System.out.println(e+"\n"+f);
            }
            else
                {
                System.out.println("корней нет");
            }
        }
    }
}
