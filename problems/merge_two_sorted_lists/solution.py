# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
      
        result = dummy = ListNode()
        while(list1!=None and list2!=None):
            print(dummy)
            if list1.val >= list2.val:
                dummy.next = ListNode(list2.val)
                list2 = list2.next
            else:
                dummy.next = ListNode(list1.val)
                list1 = list1.next
            dummy = dummy.next
        if(list1!=None):
            dummy.next = list1
        else:
            dummy.next = list2
        return result.next
        