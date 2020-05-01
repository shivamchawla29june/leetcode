class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
    PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(new Comparator<Integer>() {
        @Override
        public int compare(Integer a, Integer b) {
            return b-a; 
        }
    }); 

        int[] result= new int[nums.length-k+1];
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(pQueue.size()<k)
            {
                pQueue.add(nums[i]);
            }
            else
            {
                int max=pQueue.peek();
                result[j]=max;
                j++;
                pQueue.remove(nums[i-k]);
                pQueue.add(nums[i]);
            }
            //System.out.println(pQueue);
        }
        result[j]=pQueue.peek();
        return result;
        
    }
}