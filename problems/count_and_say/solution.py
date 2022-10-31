class Solution:
    def countAndSay(self, n: int) -> str:
        def countAndSayHelper(s):
            char = s[0]
            count = 1
            result = ""
            for i in range(1, len(s)):
                
                if s[i] == char:
                    count+=1
                else:
                    result+=str(count)
                    result+=char
                    char = s[i]
                    count = 1
            result+=str(count)
            result+=char
            return result
                
            
        if n <= 0: return "-1"
        countSayString= "1"
        for _ in range(1,n):
            countSayString = countAndSayHelper(countSayString)
        return countSayString
        
        
        