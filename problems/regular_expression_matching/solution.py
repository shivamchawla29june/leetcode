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
            
            match = stringIndex < len(s) and (s[stringIndex] == p[patternIndex] or p[patternIndex] == ".")
            if patternIndex + 1 < len(p) and p[patternIndex+1] == "*":
                cache[(stringIndex, patternIndex)] = dfs(stringIndex,patternIndex+2) or (match and dfs(stringIndex+1,patternIndex))
                return cache[(stringIndex, patternIndex)]

            if match:
                cache[(stringIndex, patternIndex)] = dfs(stringIndex+1,patternIndex+1)
                return cache[(stringIndex, patternIndex)]
            
            cache[(stringIndex, patternIndex)] = False
            return False
        
        return dfs(0,0)
            
        