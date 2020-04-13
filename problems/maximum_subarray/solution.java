class Solution {
    public int maxSubArray(int[] nums) {
        int current=0;
        int max_so_far=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                count++;
            }
            
        }
        if(count== nums.length)
        {
            max_so_far=nums[0];
            for(int i=1;i<nums.length;i++)
            {
                if(nums[i]>max_so_far)
                {
                    max_so_far=nums[i];
                }
            }
        }
        else
        {
           for(int i=0;i<nums.length;i++)
            {
                current+=nums[i];
                if(current>0)
                {

                    max_so_far = (max_so_far > current) ? max_so_far:current;
                }
                else
                {
                   current=0; 
                }
            } 
        }
        return max_so_far;
        
    }
}