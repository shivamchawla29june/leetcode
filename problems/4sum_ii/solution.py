class Solution:
    def fourSumCount(self, nums1: List[int], nums2: List[int], nums3: List[int], nums4: List[int]) -> int:
        dataEntries = defaultdict(int)
        result=0
        for i in nums1:
            for j in nums2:
                dataEntries[i+j] +=1
                
        for i in nums3:
            for j in nums4:
                result+=dataEntries[0-i-j]
                
        return result
        