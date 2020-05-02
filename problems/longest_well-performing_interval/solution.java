class Solution {
    public int longestWPI(int[] hours) {
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        int result=0;
        map.put(0,-1);
        
        for(int i=0;i<hours.length;i++)
        {
            sum=(hours[i]>8)?sum+1:sum-1;
            if(sum>0)
            {
                result=Math.max(result,i-map.get(0));
            }
            else
            {
                if(map.containsKey(sum-1))
                {
                    result=Math.max(result,i-map.get(sum-1));
                }
                if(!map.containsKey(sum))
                {
                    map.put(sum,i);
                }
            }
        }
        
        return result;
    }
}