/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode current,previous;
        current=head;
        previous=null;
        if(current==null)
        {
            return null;
        }
        while(current!=null)
        {
            if(head.val!=val)
            {
                if(current.val==val)
                {
                    previous.next=current.next;
                }
                else
                {
                    previous=current;
                }
                current=current.next;
            }
            else
            {
                head=head.next;
                current=head;
            }
            
            
        }
        return head;
        
    }
}