/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeSortedList(ListNode first,ListNode second){
        ListNode result=null;
        if(first==null)
        {
            return second;
        }
        if(second==null)
        {
            return first;
        }
        if(first.val>second.val)
        {
            result=second;
            result.next=mergeSortedList(first,second.next);
        }
        else
        {
            result=first;
            result.next=mergeSortedList(first.next,second);
        }
        return result;
    }
    public ListNode findMiddleElement(ListNode head){
        ListNode fast=head,slow=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
        
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode middleElement=head;  
        middleElement = findMiddleElement(head);
        ListNode secondList=middleElement.next;
        middleElement.next=null;
        head=sortList(head);
        secondList=sortList(secondList);
        head=mergeSortedList(head,secondList);
        return head;
        
    }
}