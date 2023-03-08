class Solution:
    def trap(self, height: List[int]) -> int:
        
        left = 0
        right = len(height)-1

        leftMax = 0
        rightMax = 0

        result = 0

        while left <= right:
            leftMax = max(leftMax, height[left])
            rightMax = max(rightMax, height[right])

            if leftMax < rightMax:
                result+= leftMax - height[left]
                left+=1

            else:
                result+=rightMax - height[right]
                right-=1

        return result

