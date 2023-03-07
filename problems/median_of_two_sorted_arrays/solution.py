import sys
class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        if len(nums1) > len(nums2) : 
            return self.findMedianSortedArrays(nums2, nums1)
        
        lenNums1 = len(nums1)
        lenNums2 = len(nums2)
        
        low = 0 
        high = lenNums1
        
        while low <= high:
            part1 = (low+high) // 2
            part2 = ((lenNums1+lenNums2+1) // 2) - part1
            
            maxLeft1 = nums1[part1-1] if part1!=0 else float("-inf")
            minRight1 = nums1[part1] if part1!=lenNums1 else float("inf")
            
            maxLeft2 = nums2[part2-1] if part2!=0 else float("-inf")
            minRight2 = nums2[part2] if part2!=lenNums2 else float("inf")
            
            # print(maxLeft1, minRight1, maxLeft2, minRight2)
            
            if maxLeft1 <= minRight2 and maxLeft2 <= minRight1:
                if (lenNums1+lenNums2)%2 == 0:
                    return (max(maxLeft1, maxLeft2) + min(minRight1, minRight2))/2
                else:
                    return max(maxLeft1, maxLeft2)/1
            elif maxLeft1 > minRight2:
                high = part1 - 1
            else:
                low = part1 + 1
                
        return -1
                    
            
        
        
        
        
        