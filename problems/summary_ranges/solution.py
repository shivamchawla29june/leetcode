class Solution:
    def getRangeValue(self, low, high):
        if low != high:
            return str(low)+"->"+str(high)
        return str(low)
    def summaryRanges(self, nums: List[int]) -> List[str]:
        result=[]
        if len(nums) == 0:
            return result
        startValue=nums[0]
        endValue = nums[0]
        for i in range(1, len(nums)):
            if endValue == nums[i]-1:
                endValue=nums[i]
            else:
                result.append(self.getRangeValue(startValue,endValue))
                startValue=nums[i]
                endValue=nums[i]
        result.append(self.getRangeValue(startValue, endValue))
        return result