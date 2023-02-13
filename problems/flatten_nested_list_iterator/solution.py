# """
# This is the interface that allows for creating nested lists.
# You should not implement it, or speculate about its implementation
# """
#class NestedInteger:
#    def isInteger(self) -> bool:
#        """
#        @return True if this NestedInteger holds a single integer, rather than a nested list.
#        """
#
#    def getInteger(self) -> int:
#        """
#        @return the single integer that this NestedInteger holds, if it holds a single integer
#        Return None if this NestedInteger holds a nested list
#        """
#
#    def getList(self) -> [NestedInteger]:
#        """
#        @return the nested list that this NestedInteger holds, if it holds a nested list
#        Return None if this NestedInteger holds a single integer
#        """

class NestedIterator:
    elements = []
    current = 0
    def init(self, nl):
        if len(nl) == 0:
            return
        for i in nl:
            # print(self.elements)
            if i.isInteger():
                self.elements.append(i.getInteger())
            else:
                self.init(i.getList())
    
    def __init__(self, nestedList: [NestedInteger]):
        self.elements=[]
        if len(nestedList) == 0:
            return
        self.init(nestedList)
        
    
    def next(self) -> int:
        self.current+=1
        return self.elements[self.current-1]
        
    def hasNext(self) -> bool:
        return self.current < len(self.elements)
                
                
         

# Your NestedIterator object will be instantiated and called as such:
# i, v = NestedIterator(nestedList), []
# while i.hasNext(): v.append(i.next())