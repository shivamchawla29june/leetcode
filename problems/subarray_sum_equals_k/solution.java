class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> sumSoFar = new HashMap();
        sumSoFar.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sumSoFar.containsKey(sum-k))
            {
                count+=sumSoFar.get(sum-k);
            }
            if(sumSoFar.containsKey(sum))
            {
                sumSoFar.replace(sum,(sumSoFar.get(sum)+1));
            }
            else
            {
                sumSoFar.put(sum,1);
            }
            
        }
        return count;
    }
}