# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head == None: return None
        dummy = temp = head
        for _ in range(n):
            dummy = dummy.next
        if dummy == None: return head.next
        while dummy.next:
            temp = temp.next
            dummy = dummy.next
        temp.next = temp.next.next
        return head        
        
        