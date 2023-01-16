class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        result = [False] * (len(s)+1)
        result[0] = True
        for i in range(len(s)+1):
            for j in range(i):
                if result[j] == True and s[j:i] in wordDict:
                    result[i] = True
                    break
                
        return result[len(s)]
        
        