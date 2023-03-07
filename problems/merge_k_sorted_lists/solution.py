# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        headForDummy = current = ListNode(0)
        heap = []
        for i, head in enumerate(lists):
            if head:
                heap.append((head.val, i, head))
            
        heapify(heap)
        
        while len(heap) != 0:
            value, i, currentNode = heap[0]
            
            if not currentNode.next:
                heappop(heap)
            else:
                heapreplace(heap, (currentNode.next.val, i, currentNode.next))
            current.next = currentNode
            current = current.next
        
        return headForDummy.next
            
                
            
        