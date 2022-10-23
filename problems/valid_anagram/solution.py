class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        data = {}
        for i in s:
            data[i] = data.get(i,0)+1
        for i in t:
            if i not in data or data[i]==0:
                return False
            else:
                data[i] -=1
        for v in data.values():
            if v >0:
                return False
        return True
            
            
        