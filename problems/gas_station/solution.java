class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    
        int left=0;
        int value=0;
        int start=0;
        for(int i=0;i<gas.length;i++)
        {
            value+=gas[i]-cost[i];
            left+=gas[i]-cost[i];
            if(value<0)
            {
                value=0;
                start=i+1;
            }
        }
        return (left>=0)?start:-1;

    }
}