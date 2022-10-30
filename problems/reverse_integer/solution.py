class Solution:
    def reverse(self, x: int) -> int:
        # sign = 1        
        # if x<0: 
        #     sign = -1
        #     x= -1*x
        # value = str(x)
        # value = value[::-1]
        # x = int(value)
        # if x > 2**31:
        #     return 0
        # return sign*x
        
        result=0
        sign = -1 if x<0 else 1
        x = x*sign
        while x !=0 :
            remainder = x%10
            result = int(result*10 + remainder)
            x = int(x/10)
        return sign*result if result < 2**31 else 0
        