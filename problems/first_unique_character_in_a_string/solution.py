class Solution:
    def firstUniqChar(self, s: str) -> int:
        data={}
        chars = set()
        for i,value in enumerate(s):
            if value not in chars:
                chars.add(value)
                data[value]=i
            elif value in data:
                del data[value]
        print(data)
        return min(data.values()) if data else -1
        
            
        