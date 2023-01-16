
class Node:
    def __init__(self, key, val):
        self.key, self.val = key, val
        self.prev = self.next = None
        
class LRUCache:
    def __init__(self, capacity: int):
        self.cap = capacity
        self.cache = {}
        
        self.left, self.right = Node(0,0), Node(0,0)
        self.left.next, self.right.prev = self.right, self.left
        
    def remove(self, node):
        previousElement = node.prev
        nextElement = node.next
        previousElement.next = nextElement
        nextElement.prev = previousElement
        
    def add(self, node):
        nextElement = self.right
        previousElement = self.right.prev
        previousElement.next = node
        nextElement.prev = node
        node.next = nextElement
        node.prev = previousElement
        
        
    def get(self, key: int) -> int:
        if key in self.cache:
            self.remove(self.cache[key])
            self.add(self.cache[key])
            return self.cache[key].val
        return -1
        
    def put(self, key: int, value: int) -> None:
        if (len(self.cache) >= self.cap) and (key not in self.cache):
            lruElement = self.left.next
            self.remove(lruElement)
            del self.cache[lruElement.key]
        
        if key in self.cache:
            self.remove(self.cache[key])
        self.cache[key] = Node(key,value)
        self.add(self.cache[key])

# Your LRUCache object will be instantiated and called as such:
# obj = LRUCache(capacity)
# param_1 = obj.get(key)
# obj.put(key,value)