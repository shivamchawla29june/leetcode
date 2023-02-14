class Solution:
    def longestSubstring(self, s: str, k: int) -> int:
        
        if k > len(s) or len(s) == 0:
            return 0
        if k == 0 or k == 1:
            return len(s)
        
        dataEntries = {}
        for i in range(len(s)):
            dataEntries[s[i]] = 1 + dataEntries.get(s[i],0)
        
        cutOff = 0
        while cutOff< len(s) and dataEntries[s[cutOff]] >= k:
            cutOff+=1
        if cutOff >=len(s):
            return len(s)
            
        l1 = self.longestSubstring(s[:cutOff],k)
        while cutOff<len(s) and dataEntries[s[cutOff]] < k:
            cutOff+=1
        l2 = self.longestSubstring(s[cutOff:],k) if cutOff < len(s) else 0
        return max(l1, l2)
            
        
        
        