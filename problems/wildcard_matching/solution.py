class Solution:
    def isMatch(self, s: str, p: str) -> bool:
        
        cache = {}
        
        def dfs(stringIndex,patternIndex):
            
            if (stringIndex, patternIndex) in cache:
                return cache[(stringIndex, patternIndex)]
            if stringIndex >= len(s) and patternIndex >= len(p):
                return True
            if patternIndex >=len(p):
                return False
#             if stringIndex == len(s):
#                 if p[patternIndex] == "*" and patternIndex+1 == len(p):
#                     cache[(stringIndex, patternIndex)] = True
#                     return True
#                 else:
                    
#                     cache[(stringIndex, patternIndex)] = dfs(stringI)
#                     return False 
            
            match = stringIndex < len(s) and (s[stringIndex] == p[patternIndex] or p[patternIndex] == "?")
            if p[patternIndex] == "*":
                if stringIndex == len(s):
                    cache[(stringIndex, patternIndex)] = dfs(stringIndex,patternIndex+1)
                else:
                    cache[(stringIndex, patternIndex)] = dfs(stringIndex,patternIndex+1) or dfs(stringIndex+1,patternIndex)
                return cache[(stringIndex, patternIndex)]

            if match:
                cache[(stringIndex, patternIndex)] = dfs(stringIndex+1,patternIndex+1)
                return cache[(stringIndex, patternIndex)]
            

            
            cache[(stringIndex, patternIndex)] = False
            return False
        
        value = dfs(0,0)
        # print(cache)
        return value
        