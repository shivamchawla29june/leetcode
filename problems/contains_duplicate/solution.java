class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> duplicatecheck=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!duplicatecheck.contains(nums[i]))
            {
                duplicatecheck.add(nums[i]);
            }
            else
            {
                return true;
            }
        }
        return false;
        
    }
}