class Solution {
    public int climbStairs(int n) {
        if(n==0) return 1;
        int[] result= new int[n];
        result[0]=1;
        if(n==1) return result[0];
        result[1]=2;
        for(int i=2;i<n;i++)
        {
            result[i]=result[i-1]+result[i-2];
        }
        return result[n-1];
        
    }
}