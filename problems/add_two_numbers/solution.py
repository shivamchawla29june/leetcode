# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        if l1 == None and l2 == None:
            return l1
        if l1 == None:
            return l1
        if l2 == None:
            return l2
        prev = dummy = ListNode()
        carry=0
        while l1 or l2:
            x = l1.val if l1 else 0
            y = l2.val if l2 else 0
            
            totalSum = x+y +carry
            value = int(totalSum%10)
            carry = int(totalSum/10)
            prev.next = ListNode(value)
            
            prev = prev.next
            if l1:
                l1 = l1.next
            if l2:
                l2 = l2.next
            
        if carry == 1:
            prev.next = ListNode(1)
        return dummy.next

            
            
            
            
            
        