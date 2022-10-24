class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        if n < 1:
            return False
        return abs(math.log(n,3) - round(math.log(n,3))) < 1e-10
        