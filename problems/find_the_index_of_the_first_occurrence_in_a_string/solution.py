from ast import pattern


class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        # i=0
        # while i<len(haystack):
        #     if haystack[i] == needle[0]:
        #         originalStart=i+1
        #         j=1

        #         while originalStart < len(haystack) and j < len(needle) and haystack[originalStart] == needle[j] :
        #             originalStart+=1
        #             j+=1
        #         if j == len(needle):
        #             return i
        #     i+=1
        # return -1
        
        #KMP Algorithm
        
        patternDP = [0]*len(needle)
        leftPointer = 0
        rightPointer = 1
        while rightPointer < len(needle):
            if needle[rightPointer] == needle[leftPointer]:
                patternDP[rightPointer] = 1 + leftPointer
                leftPointer+=1
                rightPointer+=1
            else:
                if leftPointer == 0:
                    patternDP[rightPointer] = 0
                    rightPointer+=1
                else:
                    leftPointer = patternDP[leftPointer-1]
        stringPointer = 0
        patternPointer =0
        while stringPointer < len(haystack):
            if haystack[stringPointer] == needle[patternPointer]:
                stringPointer+=1
                patternPointer+=1
            else:
                if patternPointer !=0:
                    patternPointer = patternDP[patternPointer-1]
                else:
                    stringPointer+=1
            if patternPointer == len(needle):
                return stringPointer-patternPointer
        return -1
            
            
        
        