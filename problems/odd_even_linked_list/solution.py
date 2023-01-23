# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def oddEvenList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return
        
        lastNode = head
        count = 1
        while lastNode.next:
            lastNode = lastNode.next
            count+=1
        current = head
        lastElement = lastNode
        i=0
        
        if count < 3:
            return head
        
        # print(count)
        while i < int(count/2):
            
            temp = current.next
            current.next = current.next.next
            
            lastElement.next = temp
            temp.next = None
            
            lastElement = lastElement.next
            current = current.next
            
            i+=1
            
            # print(head)
            
        return head
        
                
        