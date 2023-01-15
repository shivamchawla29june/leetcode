class Solution:
    def partition(self, s: str) -> List[List[str]]:
        result = []
        part =[]
        
        def dfs(i):
            if i>=len(s):
                result.append(list(part))
                return
            
            for j in range(i, len(s)):
                if self.isPalindrome(s, i, j):
                    part.append(s[i:j+1])
                    dfs(j+1)
                    part.pop()
        
        dfs(0)
        return result
          
    def isPalindrome(self, s, start, end):
        while start < end:
            if s[start] != s[end]:
                return False
            start+=1
            end-=1
        return True
                
        