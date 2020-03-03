class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> Result = new ArrayList<>();
        if(nums.length>0)
        {
        int voter1 = nums[0];
        int count1=1;
        int voter2= (-1);
        int count2=0;
        for(int i=1;i<nums.length;i++)
        {
            if(count1==0 && voter2 != nums[i])
            {
                voter1=nums[i];
            }
            if(count2==0 && voter1 != nums[i])
            {
                voter2=nums[i];
            }
            
            if(nums[i]==voter1)
            {
                count1++;
            }
            else if(nums[i]==voter2)
            {
                count2++;
            }
            else
            {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==voter1)
            {
                count1++;
            }
            else if(nums[i]==voter2)
            {
                count2++;
            }
        }
        if(count1>nums.length/3)
        Result.add(voter1);            
        if(count2>nums.length/3)
        Result.add(voter2);   
        }
        return Result;
    }
}