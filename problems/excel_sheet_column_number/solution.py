class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        result=0
        for i in columnTitle:
            value = ord(i)-64
            result=result*26+value
        return result
        
        