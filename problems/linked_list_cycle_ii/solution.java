/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        if(fast ==null || fast.next==null || fast.next.next==null)
        {
            return null;
        }
        fast=fast.next.next;
        slow=slow.next;
        while(slow!=fast)
        {
            if(fast.next==null || fast.next.next == null)
            {
                return null;
            }
            fast=fast.next.next;
            slow=slow.next;
        }
        slow=head;
        while(fast!=slow)
        {
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}