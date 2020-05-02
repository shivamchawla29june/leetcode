class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, -1);
        Stack<Integer> temp= new Stack<>();
        for(int i=0;i<2*nums.length;i++)
        {
            while(!temp.isEmpty() && nums[temp.peek()]<nums[i % nums.length])
            {
                result[temp.pop()]=nums[i % nums.length];
            }
            if(i<nums.length) temp.push(i % nums.length);
        }
        return result;
        
    }
}