class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
    
        if (dividend == -2147483648 and divisor == -1): return 2147483647
        result=0
        dividendAlt = abs(dividend)
        divisorAlt = abs(divisor)
        for x in range(32)[::-1]:
            if dividendAlt - (divisorAlt<<x) >= 0:
                result += 1 << x
                dividendAlt -= divisorAlt << x
        return result if (dividend > 0) == (divisor > 0) else -result
            