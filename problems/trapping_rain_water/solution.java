class Solution {
    public int trap(int[] height) {
        int leftpointer=0;
        int rightpointer=height.length-1;
        int count=0;
        int left_max=0;
        int right_max=0;
        while(leftpointer<rightpointer)
        {
            if(height[leftpointer]<height[rightpointer])
            {
                if(height[leftpointer]>=left_max)
                {
                    left_max=height[leftpointer];
                }
                else
                {
                    count+=left_max-height[leftpointer];
                }
                leftpointer++;
            }
            else
            {
                if(height[rightpointer]>=right_max)
                {
                    right_max=height[rightpointer];
                }
                else
                {
                    count+=right_max-height[rightpointer];
                }
                rightpointer--;
            }
        }
        return count;
        
    }
}