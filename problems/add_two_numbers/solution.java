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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead= new ListNode();
        ListNode result=dummyHead;
        int carry=0;
        while(l1!=null || l2!=null)
        {
            int x= (l1==null)?0:l1.val;
            int y= (l2==null)?0:l2.val;
            
            int sum=x+y+carry;
            carry=sum/10;
            sum=sum%10;
            
            ListNode new_node = new ListNode(sum);
            result.next=new_node;
            
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
            result=result.next;
        }
        if(carry>0)
        {
            ListNode new_node = new ListNode(carry);
            result.next=new_node;
        }
        return dummyHead.next;        
    }
}