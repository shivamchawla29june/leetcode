class Solution:
    def isPalindrome(self, s: str) -> bool:
        
        palindromeCheck = ''.join(filter(str.isalnum, s)).lower()
        if len(palindromeCheck) <=1:
            return True
        start = 0
        end = len(palindromeCheck)-1
        while start < end:
            if palindromeCheck[start] != palindromeCheck[end]:
                return False
            start+=1
            end-=1
        return True
        