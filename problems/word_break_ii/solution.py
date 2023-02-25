class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> List[str]:
        memo = {}
        
        def dfs(string):
            if string in memo:
                return memo[string]
            
            if not string:
                return [""]
            
            localList = []
            
            for word in wordDict:
                if string.startswith(word):
                    subWords = dfs(string[len(word):])
                    
                    for subWord in subWords:
                        localList.append(word + (" " if subWord else "") + subWord)
                        
            memo[string] = localList
            return localList
        
        return dfs(s)
            
        
        