class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> valueStorage = new HashMap<>();
        for(int traversal =0; traversal<nums.length;traversal++){
            if(valueStorage.containsKey(nums[traversal])){
                return true;
            }
                valueStorage.put(nums[traversal], traversal);
        }
        return false;
    }
}