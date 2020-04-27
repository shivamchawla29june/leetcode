/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result;
        ListNode finalresult;
        if(l1==null && l2==null)
        {
            return null;
        }
        if(l1==null && l2!=null)
        {
            return l2;
        }
        if(l2==null)
        {
            return l1;
        }
        if(l1.val<l2.val)
        {
            result=l1;
            l1=l1.next;
        }
        else
        {
            result=l2;
            l2=l2.next;
        }
        finalresult=result;
        while(l1!=null || l2!=null)
        {
            if(l1==null && l2!=null)
            {
                result.next=l2;
                l2=l2.next;
            }
            if(l2==null && l1!=null)
            {
                result.next=l1;
                l1=l1.next;
            }
            if(l1!=null && l2!=null)
            {
                if(l1.val<l2.val)
                {
                    result.next=l1;
                    l1=l1.next;
                }
                else
                {
                    result.next=l2;
                    l2=l2.next;
                }
            }
            
            result=result.next;
        }
        return finalresult;
        
    }
}