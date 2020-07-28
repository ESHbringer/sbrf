package com.sbrf.demo;
import java.util.Scanner;

public class Task12
{
    public static void main(String[] args)
    {
        String s;
        int a;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        a = in.nextInt();
        for (int i = 0; i < s.length(); i++)
        {
            if (i != a)
            {
                char now = s.charAt(i);
                System.out.print(now);
            }
        }
    }
}
