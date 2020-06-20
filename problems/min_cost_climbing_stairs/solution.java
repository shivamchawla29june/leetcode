class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int last2last=0;
        int last=0;
        int current=0;
        for(int i=2;i<=cost.length;i++)
        {
            current=Math.min(last2last+cost[i-2],last+cost[i-1]);
            last2last=last;
            last=current;
        }
        return current;
    }
}