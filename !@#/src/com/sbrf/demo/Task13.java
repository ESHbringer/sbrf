package com.sbrf.demo;
import java.util.Random;
import java.util.Scanner;

public class Task13
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int[] arr;
        int n, m;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = (int) rand.nextInt(100);
        m = 0;
        while (m != 3)
        {
            System.out.println("\n"+"1. Вывести массив" + "\n" + "2. Увеличить элемент массива на 10%" + " \n" + "3. Выход");
            m = in.nextInt();
            if (m == 1) for (int i = 0; i < n; i++)
            {
                System.out.print(arr[i]+" ");
            }
            if (m == 2) {
                System.out.println("Введите номер элемента");
                int b = in.nextInt();
                arr[b] = (int) (arr[b] * 1.1);
                System.out.print(arr[b]);
            }
        }
    }
}
