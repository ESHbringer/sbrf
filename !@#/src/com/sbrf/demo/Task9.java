package com.sbrf.demo;

public class Task9
{
    public static void main(String[] args)
    {
        int a = 98;
        for (int i = 2; i < a; i++)
        {
            boolean b = true;
            int c = (int) Math.sqrt(i);
            for (int j = 2; j <=c; j++)
            {
                if ((i % j) == 0)
                {
                    b = false;
                    break;
                }
            }
            if (b)
            {
                System.out.print(i +" ");
            }
        }
    }
}
