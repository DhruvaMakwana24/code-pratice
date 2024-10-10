import java.lang.*;
import java.util.*;
import java.io.*;

class Node
{

    int data;
    Node next;
    Node back;

    Node(int data1){
        this.data = data1;
        this.next = null;
        this.back = null;
    }

    Node(int data1,Node next1,Node back1) 
    {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }
}
 

class deletetail
{

    private static Node convert2ddl(int[] arr)
    {
        Node head = new Node(arr[0]);
        Node prev = head;
        int i;
        for ( i=1;i<arr.length; i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
            }
       
         return head;
    }
    private static Node deletetail (Node head){
        if (head == null || head.next == null)
        {
            return null;
        }
        Node tail = head;
        while(tail.next != null){
            tail= tail.next;
        }
        Node prev = tail.back;
        prev.next = null;
        tail.back = null;
        return head;

    }
     private static void print(Node head)
     {
        while(head!= null)
        {
            System.out.print(head.data+ " ");
            head = head.next;
        } 
     }
    public static void main(String args[])
    {
         int[] arr = {2,5,6,8};
         Node head = convert2ddl(arr);
         //print(head);
         Node result = deletetail(head);
         print(result);
    }
}