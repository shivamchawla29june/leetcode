
class Solution:
    def maxArea(self, height: List[int]) -> int:
        leftPointer =0
        rightPointer = len(height)-1
        maxArea =0
        while leftPointer < rightPointer:
            minHeight = min(height[leftPointer],height[rightPointer])
            area = minHeight*(rightPointer-leftPointer)
            maxArea = max(area, maxArea)
            if height[leftPointer]<height[rightPointer]:
                leftPointer+=1
            else:
                rightPointer-=1
        return maxArea
        
        