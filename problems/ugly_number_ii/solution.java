class Solution {
    public int nthUglyNumber(int n) {
        if(n==0 || n==1) return 1;
        int[] uglyArray = new int[n];
        uglyArray[0]=1;
        int two=0;
        int three=0;
        int five=0;
        
        for(int i=1;i<n;i++)
        {
            int min= Math.min(uglyArray[two]*2,Math.min(uglyArray[three]*3,uglyArray[five]*5));
            
            uglyArray[i]=min;
            
            if(min==uglyArray[five]*5) five++;
            if(min==uglyArray[three]*3) three++;
            if(min==uglyArray[two]*2) two++;
        }
        return uglyArray[n-1];
    }
}