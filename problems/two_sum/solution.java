class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Integer lengthofArray= nums.length;
        HashMap<Integer,Integer> sumList= new HashMap<Integer,Integer>(lengthofArray);
        int Result[]= new int[2];
        for(Integer i=0;i<nums.length;i++)
        {
            sumList.put(nums[i],i);
        }
        for(Integer j=0;j<nums.length;j++)
        {
            if(sumList.containsKey(target-nums[j]))
            {
                if(sumList.get(target-nums[j]) != j)
                   {
                        Result[0]=j;
                        break;                       
                   }

            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if((target-nums[Result[0]]) == nums[i])
            {
                Result[1]=i;
            }     
        }
        return Result;
    }
}