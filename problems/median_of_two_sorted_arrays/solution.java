class Solution {
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length) return findMedianSortedArrays(nums2,nums1);
        int x= nums1.length;
        int y=nums2.length;
        
        int low=0;
        int high=x;
        while(low<=high)
        {
            int part1=(low+high)/2;
            int part2=(x+y+1)/2 - part1;
            
            int maxLeftX= part1==0?Integer.MIN_VALUE:nums1[part1-1];
            int minRightX= part1==x?Integer.MAX_VALUE:nums1[part1];
            
            int maxLeftY = part2==0?Integer.MIN_VALUE:nums2[part2-1];
            int minRightY= part2==y?Integer.MAX_VALUE:nums2[part2];
            
            if(maxLeftX<=minRightY && maxLeftY<=minRightX)
            {
                if((x+y)%2==0)
                {
                    return (double)(Math.max(maxLeftX,maxLeftY)+Math.min(minRightX,minRightY))/2;
                }
                else
                {
                    return (double)Math.max(maxLeftX,maxLeftY);
                }
                
            }
            else if(maxLeftX>minRightY)
            {
                high=part1-1;
            }
            else
            {
                low=part1+1;
            }   
        }
        return -1;
    }
}