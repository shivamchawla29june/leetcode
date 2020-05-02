class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1) return intervals;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        int index=0;
        
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[index][1]>=intervals[i][0])
            {
                if(intervals[index][1]<intervals[i][1])
                {
                    intervals[index][1]=intervals[i][1];
                }
            }
            else
            {
                intervals[++index]=intervals[i];
            }
        }
        return Arrays.copyOf(intervals,index+1);
    }
}