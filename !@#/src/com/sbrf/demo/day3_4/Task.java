package com.sbrf.demo.day3_4;
import java.util.Scanner;

class LList
{
    private Node root;

    public void add(Object obj)
    {
        if (obj == null)
            return;
        Node node = new Node(obj);
        Node last = findLast();

        if (last == null)
        {
            root = node;
        } else
            {
            last.next = node;
        }
    }

    public int size()
    {
        if (root == null)
            return 0;

        int count = 1;
        Node currentNode = root;

        while (currentNode.next != null)
        {
            currentNode = currentNode.next;
            count++;
        }
        return count;
    }

    /* day 4 */
    public Object get(int id)
    {
        try {
            Node item = root;
            for (int i = 0; i < id - 1; i++)
            {
                item = item.next;
            }

            return item.data;

        } catch (NullPointerException e) {
            return "...";
        }
    }

    /* day 3 */
    /*public Object get(int id)
    {

        Node item = root;
        if (0 >= id || id > size())
        {
            return "...";
        }
        for (int i = 0; i < id - 1; i++)
        {
            item = item.next;
        }

        return item.data;
    }*/

    private Node findLast()
    {
        if (root == null)
            return null;
        else
            {
            Node currentNode = root;
            while (currentNode.next != null)
            {
                currentNode = currentNode.next;
            }
            return currentNode;
        }
    }
}

class Node
{
    Object data;
    Node next;

    public Node(Object item)
    {
        this.data = item;
    }
}

public class Task
{
    public static void main(String[] args)throws Exceptions
    {
        LList ll = new LList();
        Scanner in = new Scanner(System.in);
        int cycle = 0;
        while(cycle != 1)
        {
            String a = in.nextLine();
            switch(a)
            {
                case "add":
                    String ad = in.next();
                    ll.add(ad);
                    break;
                case "size":
                    int count = ll.size();
                    System.out.println("List size = " + count);
                    break;
                case "get":
                    int gt = in.nextInt();
                    if (gt <= 0) {
                        throw new Exceptions("Выход за границу");
                    }
                    System.out.println(ll.get(gt));
                    break;
                case "quit":
                    cycle = ++cycle;
                    break;
            }
        }
    }
}
