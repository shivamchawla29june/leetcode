class Solution:
    def longestPalindrome(self, s: str) -> str:
        # DP Solution
        # dpMatrix = [[0]*len(s) for _ in range(len(s))]
        # longestPalin = s[0]
        
        # for diff in range(len(s)):
        #     start=0
        #     end=start+diff
        #     while end<len(s):
        #         if start==end:
        #             dpMatrix[start][end] = 1
        #         elif end - start == 1:
        #             if s[start] == s[end]:
        #                 dpMatrix[start][end] = 1
        #         else:
        #             if s[start] == s[end] and dpMatrix[start+1][end-1] == 1:
        #                 # print(dpMatrix)
        #                 dpMatrix[start][end] = 1

        #         if dpMatrix[start][end]==1 and len(longestPalin) < len(s[start:end+1]):
        #             longestPalin = s[start:end+1]
        #         start+=1
        #         end+=1             
        # return longestPalin
        
        # Expanding from the center
        
        result=""
        def expandFromCenter(s, middleStart, middleEnd):
            while middleStart>=0 and middleEnd <len(s) and s[middleStart] == s[middleEnd]:
                middleEnd+=1
                middleStart-=1
            return s[middleStart+1:middleEnd]
        for i in range(len(s)):
            evenString = expandFromCenter(s, i, i)
            if len(evenString) > len(result):
                result = evenString
            oddString = expandFromCenter(s, i, i+1)
            if len(oddString) > len(result):
                result = oddString    
        return result
        

                    
    
        