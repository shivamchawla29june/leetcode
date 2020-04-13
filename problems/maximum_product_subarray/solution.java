class Solution {
    public int maxProduct(int[] nums) {
        int max_so_far=nums[0];
        int current_max=nums[0];
        int current_min=nums[0];
        int temp=0;
        
        for(int i=1;i<nums.length;i++)
        {
            temp=current_max;
            current_max=Math.max(Math.max(current_max*nums[i],current_min*nums[i]),nums[i]);
            current_min=Math.min(Math.min(temp*nums[i],current_min*nums[i]),nums[i]);
            if(max_so_far<current_max)
            {
                max_so_far=current_max;
            }
        }
        return max_so_far;
    }
}