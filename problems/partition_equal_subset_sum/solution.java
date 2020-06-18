class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        if(sum%2!=0) return false;
        else sum=sum/2;
        boolean[][] result= new boolean[nums.length+1][sum+1];
        for(int i=0;i<result.length;i++)
        {
            result[i][0]=true;
        }        
        // This is the nums
        for(int i=1;i<result.length;i++)
        {
            //j  --> sum
            for(int j=1;j<result[0].length;j++)
            {
                if(j-nums[i-1]>=0)
                {
                    result[i][j] = result[i - 1][j - nums[i - 1]] || result[i - 1][j];                    
                }
                else
                {
                    result[i][j]=result[i-1][j];
                }
            }
        }
        return result[nums.length][sum];
    }
}