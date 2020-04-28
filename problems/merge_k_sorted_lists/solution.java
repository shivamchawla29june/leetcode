/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head=null;
        ListNode tail=null;
        PriorityQueue<ListNode> pQueue = new PriorityQueue<ListNode>(new Comparator<ListNode>() { 
            public int compare(ListNode a, ListNode b) 
            { 
                return a.val - b.val; 
            } 
        });
        for(int i=0;i<lists.length;i++)
        {
            if(lists[i]!=null)
            {
                pQueue.add(lists[i]);
            }
            
        }
        while(!pQueue.isEmpty())
        {
            ListNode temp=pQueue.peek();
            pQueue.remove(temp);
            
            if(temp.next!=null)
            {
                pQueue.add(temp.next);
            }
            
            if(head!=null)
            {
                tail.next=temp;
                tail=temp;
            }
            else
            {
                head=temp;
                tail=temp;
            }
        }
        return head;
        
        
    }
}