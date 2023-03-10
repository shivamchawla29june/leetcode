class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        result = []
        queue = collections.deque()
        leftPointer = 0 
        rightPointer = 0

        while rightPointer < len(nums):
            while queue and nums[queue[-1]] < nums[rightPointer]:
                queue.pop()
            queue.append(rightPointer)

            if leftPointer > queue[0]:
                queue.popleft()

            if (rightPointer+1) >= k:
                result.append(nums[queue[0]])
                leftPointer+=1
            rightPointer+=1
        return result
            


