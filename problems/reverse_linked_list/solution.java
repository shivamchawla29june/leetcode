/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current,previous_pointer,next_pointer;
        current=head;
        previous_pointer=null;
        while(current!=null)
        {
            next_pointer=current.next;
            current.next=previous_pointer;
            previous_pointer=current;
            current=next_pointer;
        }
        head=previous_pointer;
        return head;
    }
}