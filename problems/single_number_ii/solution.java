class Solution {
    public int singleNumber(int[] nums) {
        int temp=0;
        int result=0;
        int count=0;
        for(int i=0;i<32;i++)
        {
            temp = 1 << i;
            for(int j=0;j<nums.length;j++)
            {
                if ((nums[j] & temp)!=0)
                {
                    count++;
                }
            }
            result = result | ((count%3 ) << i);
            count=0;
        }
        return result;
        
    }
}