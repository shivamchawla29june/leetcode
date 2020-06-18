class Solution {
    public int longestPalindromeSubseq(String s) {
        int[][] result= new int[s.length()][s.length()];
        for(int i=0;i<result.length;i++)
            result[i][i]=1;
        for(int wordsize=2;wordsize<=result.length;wordsize++)
        {
            for(int i=0;i<result.length-wordsize+1;i++)
            {
                int j=i+wordsize-1;
                
                if(wordsize==2 && s.charAt(j)==s.charAt(i))
                {
                    result[i][j]=2;
                }
                else if(s.charAt(j)==s.charAt(i))
                {
                    result[i][j]=2+result[i+1][j-1];
                }
                else
                {
                    result[i][j]=Math.max(result[i][j-1],result[i+1][j]);
                }
            }
        }
        return result[0][result.length-1];
        
        
    }
}