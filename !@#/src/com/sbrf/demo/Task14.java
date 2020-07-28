package com.sbrf.demo;
import java.util.Scanner;
import java.util.Random;

public class Task14
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        char ch = (char) ('a' + new Random().nextInt(26));
        System.out.println(ch);
        for (char i = 0; i < 26; i++)
        {
            char s = in.next().charAt(0);

            if (ch == s)
            {
                System.out.println("Right");
                break;
            }
            else
                {
                System.out.println("try again");
            }
        }
    }
}
