class Solution {
    public int findMaxLength(int[] nums) {
        int sum=0;
        Map<Integer,Integer> sumSoFar = new HashMap();
        sumSoFar.put(0,0);
        int size=0;
        int lowerbound=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                nums[i]=-1;
            }
        }

        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sumSoFar.containsKey(sum))
            {
                lowerbound=sumSoFar.get(sum);
                if(i+1-lowerbound>size)
                {
                    size=i+1-lowerbound;
                }            
            }
            else
            {
                sumSoFar.put(sum,i+1);
            }
            
            
        }
        return size;
    }   
}