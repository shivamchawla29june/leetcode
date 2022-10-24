class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        data ={}
        result=[]
        for i in nums1:
            data[i] = data.get(i,0)+1
        for i in nums2:
            if i in data and data[i] != 0:
                result.append(i)
                data[i] = data[i]-1
        return result
            
        