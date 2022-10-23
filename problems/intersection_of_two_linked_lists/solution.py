# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        firstList=headA
        secondList=headB
        sizeA=0
        sizeB=0
        
        while firstList:
            sizeA+=1
            firstList=firstList.next
        while secondList:
            sizeB+=1
            secondList=secondList.next
        if sizeA>sizeB:
            for i in range(sizeA-sizeB):
                headA=headA.next
        else:            
            for i in range(sizeB-sizeA):
                headB=headB.next
        while headA and headB:
            
            if headA==headB:
                return headA
            headA=headA.next
            headB=headB.next
        return None
            
            
            
        