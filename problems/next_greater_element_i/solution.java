class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> records = new HashMap<>(nums2.length);
        Stack<Integer> temp= new Stack<Integer>();
        for(int i=0;i<nums2.length;i++)
        {
            while(!temp.isEmpty() && temp.peek()<nums2[i])
            {
                records.put(temp.pop(),nums2[i]);
            }
            temp.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++)
        {
            nums1[i]=records.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
}