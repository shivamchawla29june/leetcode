/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode Reverse(ListNode reverse){
        ListNode current,previous,nextptr;
        current=reverse;
        previous=null;
        while(current!=null)
        {
            nextptr=current.next;
            current.next=previous;
            previous=current;
            current=nextptr;            
        }
        reverse=previous;
        return reverse;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        ListNode temp1=head;
        int counttemp=0;
        int count=0;
        if(head==null)
        {
            return true;
        }
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        if(count%2==0)
        {
            count=count/2;
        }
        else
        {
            count=count/2+1;
        }
        counttemp=count-1;
        temp=head;
        while(count!=0)
        {
            temp1=temp;
            temp=temp.next;
            count--;
        }
        temp1.next=Reverse(temp);
        temp1=temp1.next;
        while(temp1!=null)
        {
            if(temp1.val!=head.val)
            {
                return false;
            }
            temp1=temp1.next;
            head=head.next;
        }
        
        return true;
        
    }
}