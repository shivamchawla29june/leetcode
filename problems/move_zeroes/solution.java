class Solution {
    public void moveZeroes(int[] nums) {
        int value;
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            value=nums[i];
            if(value!=0)
            {
                nums[j]=value;
                j++;
            }
        }
        for(int i=j;i<nums.length;i++)
        {
            nums[i]=0;
        }
    }
}