class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        data = set()
        for i in nums:
            if i in data:
                return True
            data.add(i)
        return False