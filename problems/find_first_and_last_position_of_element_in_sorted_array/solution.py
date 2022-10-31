class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        # result = [-1,-1]
        # foundFirst = False
        # for i, value in enumerate(nums):
        #     if value == target and foundFirst == False:
        #         foundFirst = True
        #         result[0] = i
        #         result[1] = i
        #     elif value == target:
        #         result[1] = i
        # return result
        
        # if len(nums) == 0: return [-1,-1]
        # found = False
        # start = 0
        # end = len(nums)-1
        # while start <= end:
        #     mid = start + int((end-start)/2)
        #     if nums[mid] == target:
        #         found = True
        #         break
        #     elif nums[mid] > target:
        #         end = mid - 1
        #     else:
        #         start = mid + 1
        
        # if start > end and found == False:
        #     return [-1,-1]

        # expandLeft = mid
        # expandRight = mid
        # while expandLeft >=0 and nums[expandLeft] == target:
        #     expandLeft-=1
        # while expandRight < len(nums) and nums[expandRight] == target:
        #     expandRight+=1
        # return [expandLeft+1, expandRight-1]
        
        def binarySearchTarget(target):
            low, high = 0, len(nums)
            while low < high:
                mid = int((low + high) / 2)
                if nums[mid] >= target:
                    high = mid
                else:
                    low = mid + 1
            return low
        lo = binarySearchTarget(target)
        return [lo, binarySearchTarget(target+1)-1] if target in nums[lo:lo+1] else [-1,-1]
                        
                
            
        