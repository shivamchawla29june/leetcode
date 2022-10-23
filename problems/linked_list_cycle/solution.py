# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        if head == None or head.next == None or head.next.next==None:
            return False 
        slowPointer= head.next
        fastPointer = head.next.next
        while(slowPointer != fastPointer and fastPointer!=None):
            if(fastPointer.next != None):
                fastPointer = fastPointer.next.next
            else:
                break
            slowPointer= slowPointer.next
        if fastPointer == slowPointer:
            return True
        return False
            
            
        