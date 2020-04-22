class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int index;
        for(int i=0;i<nums.length;i++)
        {
            index = Math.abs(nums[i])-1;
            if(nums[index] < 0)
            {
                result.add(Math.abs(nums[i]));
            }
            else
            {
                nums[index]=-1*nums[index];
            }
        }
        return result;
        
    }
}