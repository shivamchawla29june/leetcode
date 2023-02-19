class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if t == "":
            return ""
        
        countT, window = {}, {}
        result, resultLen = [-1,-1], float("infinity")
        leftPointer = 0
        for c in t:
            countT[c] = 1 + countT.get(c, 0)
        
        have, need = 0, len(countT)
        
        for rightPointer in range(len(s)):
            c = s[rightPointer]
            window[c] = 1 + window.get(c, 0)
            if c in countT and window[c] == countT[c]:
                have+=1
            while have == need:
                if (rightPointer - leftPointer + 1) < resultLen:
                    resultLen = rightPointer - leftPointer + 1
                    result = [leftPointer, rightPointer]
                    
                window[s[leftPointer]] -=1
                if s[leftPointer] in countT and window[s[leftPointer]] < countT[s[leftPointer]]:
                    have-=1
                
                leftPointer+=1
        left, right = result
        return s[left:right+1] if resultLen != float("infinity") else ""
                
                
            
        
        
        