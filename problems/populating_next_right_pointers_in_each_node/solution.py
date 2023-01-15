"""
# Definition for a Node.
class Node:
    def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next
"""

class Solution:
    def connect(self, root: 'Optional[Node]') -> 'Optional[Node]':
        rowWiseTraversal =[]
        if not root:
            return root
        rowWiseTraversal.append(root)
        while len(rowWiseTraversal) != 0:
            currentElement = rowWiseTraversal.pop()
            if currentElement.left and currentElement.right:
                currentElement.left.next = currentElement.right
                if currentElement.next:
                    currentElement.right.next = currentElement.next.left
                rowWiseTraversal.append(currentElement.right)
                rowWiseTraversal.append(currentElement.left)
            
        return root
        