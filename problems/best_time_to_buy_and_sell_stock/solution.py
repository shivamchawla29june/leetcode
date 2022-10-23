class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit=0
        minNumber = prices[0]
        for i in range(1, len(prices)):
            if prices[i]<=minNumber:
                minNumber = prices[i]
            else:
                profit= max(profit, prices[i]-minNumber)
        return profit
                
        