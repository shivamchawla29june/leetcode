class Solution:
    def myAtoi(self, s: str) -> int:
        
        s = s.strip()
        if len(s) == 0:
            return 0
        i=0
        result = 0
        sign = 1
        if s[0] == "-" or s[0] == "+":
            sign = -1 if s[0] == "-" else 1
            i=1
        while i < len(s) and s[i].isnumeric() :
            result = result*10 + int(s[i])
            i+=1
        if result >= 2**31:
            return 2**31-1 if sign == 1 else sign*2**31
        return sign*result
             
            
        