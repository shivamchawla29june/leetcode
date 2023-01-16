"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        
        current = head
        while current:
            temp = current.next
            current.next = Node(current.val)
            current.next.next = temp
            current = temp
            
        current = head
        while current:
            if current.random:
                current.next.random = current.random.next
            current = current.next.next
                
        dummy = Node(0)
        dummyTraversal = dummy
        
        current = head
        while current:
            dummyTraversal.next = current.next
            dummyTraversal = dummyTraversal.next
            
            current.next = current.next.next
            current = current.next
            
        return dummy.next
            
            
        
            
            
        
        
        
        
        