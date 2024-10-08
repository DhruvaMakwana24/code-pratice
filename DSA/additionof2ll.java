   # https://www.naukri.com/code360/problems/add-two-numbers_1170520?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries

# problem statment
Problem statement
You are given two non-negative numbers 'num1' and 'num2' represented in the form of linked lists.



The digits in the linked lists are stored in reverse order, i.e. starting from least significant digit (LSD) to the most significant digit (MSD), and each of their nodes contains a single digit.



Calculate the sum of the two numbers and return the head of the sum list.



Example :
Input:
'num1' : 1 -> 2 -> 3 -> NULL
'num2' : 4 -> 5 -> 6 -> NULL

Output: 5 -> 7 -> 9 -> NULL

Explanation: 'num1' represents the number 321 and 'num2' represents 654. Their sum is 975.


Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
3
1 2 3
3
4 5 6


Sample Output 1 :
5 7 9


Explanation for Sample Input 1 :
'num1' represents the number 321 and 'num2' represents 654. Their sum is 975.


Sample Input 2 :
2
0 1
1
0


Sample Output 2 :
0 1


Explanation for Sample Input 2 :
'num1' represents 10 and 'num2' represents 0. Their sum is 10.


Sample Input 3 :
1
2
2
9 9


Sample Output 3 :
1 0 1


Explanation for Sample Input 3 :
'num1' represents 2 and 'num2' represents 99. Their sum is 101.


Expected Time Complexity :
The expected time complexity is O('m' + 'n').


Constraints :
1 <= 'm', 'n' <= 5 * 10^4
0 <= 'data' in any Linked List node <= 9

The numbers do not contain any leading zeros.
If the number is zero, then there is one node having 'data' = 0.

Time Limit: 1 sec

# solution
import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

    class LinkedListNode {
        int data;
        LinkedListNode next;
        
        public LinkedListNode(int data) {
            this.data = data;
        }
    }

*****************************************************************/


public class Solution {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        LinkedListNode dummyhead = new LinkedListNode(-1);
        LinkedListNode current = dummyhead;
        LinkedListNode t1 = head1;
        LinkedListNode t2 = head2;
        int carry = 0 ;
        while (t1 != null || t2 != null){
            int sum = carry; 
            if (t1 != null){
                sum = sum + t1.data;
            }
            if (t2 != null){
                sum = sum + t2.data;
            }
            LinkedListNode newnode = new LinkedListNode(sum % 10);
            carry = sum / 10;
            current.next = newnode;
            current = current.next;
            if (t1 != null) {
                t1 = t1.next;
            }
            if (t2 != null) {
                t2 = t2.next;
            }
        }
            if (carry != 0){
                LinkedListNode newnode = new LinkedListNode(carry);
                current.next = newnode;
            }
            return dummyhead.next;


        // Write your code here.
    }
}