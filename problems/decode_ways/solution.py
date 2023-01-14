class Solution:
    def numDecodings(self, s: str) -> int:
        if len(s) == 0 or int(s[0]) == 0:
            return 0
        
        dpMatrix = [1 for _ in range(len(s))]
        for i in range(1, len(s)):
            if int(s[i]) == 0:
                dpMatrix[i] = 0
            else:
                dpMatrix[i] = dpMatrix[i-1]
            if 10 <=int(s[i-1:i+1])<=26:
                if i >1:
                    dpMatrix[i] += dpMatrix[i-2]
                else:
                    dpMatrix[i] += dpMatrix[0]
        return dpMatrix[-1]                   
        