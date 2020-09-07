class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] coinrequired= new int[amount+1];
        Arrays.fill(coinrequired,amount+1);
        coinrequired[0]=0;
        for(int i=1;i<coinrequired.length;i++)
        {
            int minimumValue=amount+1;
            for(int j=0;j<coins.length;j++)
            {
                if(i-coins[j]>=0)
                {
                    minimumValue=Math.min(minimumValue,coinrequired[i-coins[j]]+1);
                }
            }
            coinrequired[i]=minimumValue;
        }
        return coinrequired[amount]==amount+1?-1:coinrequired[amount];
    }
}