/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptr1=headA;
        ListNode ptr2=headB;
        int tempA=0;
        int tempB=0;
        while(ptr1!=ptr2)
        {
            if(ptr1==null)
            {
                tempA++;
                ptr1=headB;
            }
            else
            {
                ptr1=ptr1.next;
            }
            if(ptr2==null)
            {
                tempB++;
                ptr2=headA;  
            }
            else
            {
                ptr2=ptr2.next;
            }
            
            if(tempA==2 || tempB==2)
            {
                return null;
            }
         }
        return ptr1;

    }
}