class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> duplicatecheck=new HashMap<>();
        int difference;
        for(int i=0;i<nums.length;i++)
        {
            if(!duplicatecheck.containsKey(nums[i]))
            {
                duplicatecheck.put(nums[i],i);
            }
            else
            {
                difference=Math.abs(i-duplicatecheck.get(nums[i]));
                if(difference<=k)
                {
                    return true;
                }
                duplicatecheck.replace(nums[i],i);
            }
        }
        return false;        
    }
}