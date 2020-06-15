class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0) return 0;
        int result[]= new int[nums.length];
        Arrays.fill(result,1);
        for(int j=1;j<nums.length;j++)
        {
            for(int i=0;i<j;i++)
            {
                if(nums[i]<nums[j])
                {
                    result[j]=Math.max(result[j],result[i]+1);
                }
            }
        }
        Arrays.sort(result);
        return result[nums.length-1];        
    }
}