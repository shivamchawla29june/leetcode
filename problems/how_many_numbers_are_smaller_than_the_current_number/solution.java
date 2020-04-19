class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        ArrayList<Integer> numsCopy = new ArrayList<Integer>(nums.length);         
        for(int i=0;i<nums.length;i++)
        {
           numsCopy.add(nums[i]);
        }
        Collections.sort(numsCopy);
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=numsCopy.indexOf(nums[i]);
        }
        return nums;
    }
}