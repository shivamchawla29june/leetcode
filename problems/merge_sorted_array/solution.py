class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        list1Pointer=m
        list2Pointer=n
        while list1Pointer >0 and list2Pointer >0:
            if nums1[list1Pointer-1]>nums2[list2Pointer-1]:
                nums1[list1Pointer+list2Pointer-1] = nums1[list1Pointer-1]
                list1Pointer-=1
            else:
                nums1[list1Pointer+list2Pointer-1] = nums2[list2Pointer-1]
                list2Pointer-=1
        
        if list2Pointer>0:
            nums1[:list2Pointer] = nums2[:list2Pointer]
        return nums1
                