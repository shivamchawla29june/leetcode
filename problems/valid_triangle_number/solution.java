class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        int k=0;
        for(int i=0;i<nums.length-2;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                k=j+1;
                while( (k < nums.length)&&((nums[i]+nums[j])>nums[k]) )
                {
                    k++;
                }
                sum+=k-j-1;
            }
        }
        return sum;
        
    }
}