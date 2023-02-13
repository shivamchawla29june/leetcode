class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}
        result = []
        frequency = [[] for i in range(len(nums)+1)]
        for i in nums:
            count[i] = 1 + count.get(i,0)
        for key, value in count.items():
            frequency[value].append(key)
        for i in range(len(frequency)-1,0,-1):
            for j in frequency[i]:
                result.append(j)
                if len(result) == k:
                    return result
            
            
        