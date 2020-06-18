class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] result= new boolean[s.length()+1];
        Arrays.fill(result,false);
        result[0] = true;
        for(int i=1;i<s.length()+1;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(result[j]==true && wordDict.contains(s.substring(j,i)))
                {
                    result[i]=true;
                    break;
                }
            }
            System.out.println();
        }
        return result[s.length()];
    }
}