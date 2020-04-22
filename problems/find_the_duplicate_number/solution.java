class Solution {
    public int findDuplicate(int[] nums) {
        
        int slow_pointer=nums[0];
        int fast_pointer=nums[0];
        
        slow_pointer=nums[slow_pointer];
        fast_pointer=nums[nums[fast_pointer]];
        
        while(slow_pointer!=fast_pointer)
        {
            slow_pointer=nums[slow_pointer];
            fast_pointer=nums[nums[fast_pointer]];
        }
        
        slow_pointer=nums[0];
        while(fast_pointer!=slow_pointer)
        {
            fast_pointer=nums[fast_pointer];
            slow_pointer=nums[slow_pointer];
        }
        return slow_pointer;
    }
}