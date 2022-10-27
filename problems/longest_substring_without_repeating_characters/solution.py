class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s)==0:
            return 0
        data = {}
        maxValue=1
        leftPointer=0
        rightPointer=0
        while rightPointer < len(s):
            if s[rightPointer] not in data:
                data[s[rightPointer]] = rightPointer
            else:
                if data[s[rightPointer]]>= leftPointer:
                    leftPointer = data[s[rightPointer]] + 1
                data[s[rightPointer]] = rightPointer
            maxValue = max(maxValue, rightPointer-leftPointer+1)
            rightPointer+=1
        return maxValue
                
            
                
            
            
        