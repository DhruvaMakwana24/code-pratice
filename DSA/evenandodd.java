# https://www.naukri.com/code360/problems/rearrange-odd-and-even-places_920379?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries&leftPanelTabValue=PROBLEM

## Problem statement
You are given the 'head' of a singly linked list. Your task is to group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list’s head.



The first node is considered odd, and the second node is even, and so on.



Note:
Keep in mind that reordering is to be done according to the indexes and not the node values.
Also, ensure that the relative order inside both the even and odd groups should remain as it was in the input.


Example:
Input: 'head' -> 1 -> 3 -> 5 -> 7

Output: 'head' -> 1 -> 5 -> 3 -> 7

Explanation:
The nodes with odd indices (1, 5) are grouped together, followed by the nodes with even indices (3, 7).


Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
5
2 4 6 8 10


Sample Output 1:
2 6 10 4 8


Explanation Of Sample Input 1 :
The reordered list groups nodes with odd indices (2, 6, and 10) followed by nodes with even indices (4 and 8). So, the reordered list will look like: 2 -> 6 -> 10 -> 4 -> 8.


Sample Input 2 :
6
21 33 45 57 69 81


Sample Output 2 :
21 45 69 33 57 81 


Explanation Of Sample Input 2 :
The reordered list groups nodes with odd indices (21, 45, and 69) followed by nodes with even indices (33, 57, and 81). Thus, the reordered list will appear as: 21 -> 45 -> 69 -> 33 -> 57 -> 81.


Constraints :
1 <= 'n' <= 5000
0 <= 'data' <= 10^4

Time Limit: 1 sec


Expected Complexity :
Time Complexity : O(n)
Space Complexity : O(1)
/****************************************************************

 Following is the Linked list node structure already written:-

 class Node
 {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
 }

 *****************************************************************/

# solution
public class Solution {
    public static Node oddEvenList(Node head) {
        // Write your code here.
        if (head == null )
        {
            return null;
        }
        else if (head.next == null)
        {
            return head;
        }
        Node even = head.next;
        Node evenhead = head.next;
        Node odd = head;
        while (even != null && even.next != null)
        {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenhead;
        return head;
    }
}