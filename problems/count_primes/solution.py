class Solution:
    def countPrimes(self, n: int) -> int:
        if n < 2:
            return 0
        
        isPrime = [True] * n
        isPrime[0] = False
        isPrime[1] = False
        
        for i in range(2, int(n**0.5)+1):
            if isPrime[i]:
                j=i
                while j*i < n:
                    isPrime[j*i] = False
                    j+=1
        count=0
        for i in isPrime:
            if i:
                count+=1
        
        return count
                    
        