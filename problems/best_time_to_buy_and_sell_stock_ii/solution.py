class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        previousMax = prices[0]
        previousMin = prices[0]
        for i in range(1, len(prices)):
            if prices[i] > previousMax:
                previousMax = prices[i]
            else:
                profit += previousMax - previousMin
                previousMin = prices[i]
                previousMax = prices[i]
                
        return profit + previousMax - previousMin        
        