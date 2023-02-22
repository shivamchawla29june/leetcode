class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        maxArea = 0
        stack = []
        
        for index, height in enumerate(heights):
            start = index
            while stack and stack[-1][1] > height:
                currentIndex, currentHeight = stack.pop()
                maxArea = max(maxArea, currentHeight*(index-currentIndex))
                start = currentIndex
            stack.append((start, height))
        
        for index, height in stack:
            maxArea = max(maxArea, height*(len(heights) - index))
            
        return maxArea
        