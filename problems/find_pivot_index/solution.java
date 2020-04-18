class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int currentsum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                currentsum=0;
            }
            else
            {
              currentsum+=nums[i-1];
            }
            if(sum-currentsum-nums[i]==currentsum)
            {
                return i;
            }
        }
        return -1;
    }
}