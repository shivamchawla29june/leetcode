class Solution {
    public int threeSumClosest(int[] nums, int target) {      
        int closestSum =nums[0]+nums[1]+nums[nums.length-1];
        int currentSum=0;
        Arrays.sort(nums,0,nums.length);
        int left=0;
        int right=0;
        for(int i=0;i<nums.length-2;i++)
        {
            left=i+1;
            right=nums.length-1;
            while(left<right)
            {
                currentSum=nums[i]+nums[left]+nums[right];
                if(Math.abs(currentSum-target)<Math.abs(closestSum-target))
                {
                    closestSum=currentSum;
                }
                if(currentSum>target)
                {
                    right--;
                }
                else
                {
                    left++;
                }
            }
        }
        return closestSum;        
    }
}