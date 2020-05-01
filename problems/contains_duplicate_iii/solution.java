class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<>();
        for(int i=0;i<nums.length;i++)
        {
            Long low = set.floor((long) nums[i]);
            if(low!=null && (long)nums[i]-low<=t)
            {
                return true;
            }
            Long high= set.ceiling((long) nums[i]);
            if(high!=null && (long)high - nums[i]<=t)
            {
                return true;
            }
            set.add((long)nums[i]);
            if(set.size()>k)
            {
                set.remove((long)nums[i-k]);
            }
        }
        return false;
    }
}