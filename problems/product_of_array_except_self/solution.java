class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] fromLeft = new int[nums.length];
        int[] fromRight = new int[nums.length];
        fromLeft[0]= nums[0];
        fromRight[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++)
        {
            fromLeft[i]=fromLeft[i-1]*nums[i];
        }
        for(int i=nums.length-2;i>=0;i--)
        {
            fromRight[i]=fromRight[i+1]*nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                nums[i]=fromRight[i+1];
            }
            else if(i==nums.length-1)
            {
                nums[i]=fromLeft[i-1];
            }
            else
            {
                nums[i]=fromLeft[i-1]*fromRight[i+1];
            }
        }      
        return nums;
    }
}