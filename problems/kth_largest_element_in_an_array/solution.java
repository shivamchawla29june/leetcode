class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums.length==0) return -1;
        PriorityQueue<Integer> q1= new PriorityQueue<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer a,Integer b)
            {
                return b-a;
            }
        });
        for(int i=0;i<nums.length;i++)
        {
            q1.add(nums[i]);
        }
        for(int i=1;i<=k-1;i++)
        {
            q1.remove();
        }
        return q1.remove();
    }
}