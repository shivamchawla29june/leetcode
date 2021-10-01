class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> diffValue = new HashMap<>();
        
        for(int i=0; i< nums.length;i++)
        {
            if(diffValue.containsKey(nums[i]))
            {
                return new int[]{diffValue.get(nums[i]),i};
            }
            diffValue.put(target-nums[i],i);
    }
        return new int[2];
    }
}