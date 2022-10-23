class Solution:
    def isHappy(self, n: int) -> bool:
        hashSet = set()
        while n != 1:
            n = sum([int(i) ** 2 for i in str(n)])
            if n in hashSet:
                return False
            else:
                hashSet.add(n)
        else:
            return True