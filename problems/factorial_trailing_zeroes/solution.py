
import math

class Solution:
    def trailingZeroes(self, n: int) -> int:
        # numberOfTwos = 0
        numberofFives = 0
        for i in range(n, 0, -1):
            # while i % 2 == 0:
            #     numberOfTwos += 1
            #     i = i // 2
            # print(i, numberOfTwos)
            while i % 5 == 0:
                numberofFives += 1
                i = i // 5
            # print(i, numberofFives)
        return numberofFives
    
        # r = 0
        # while n > 0:
        #     n /= 5
        #     r += n
        # return r
        
        