class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dpmatrix= new int[text1.length()+1][text2.length()+1];
        for(int i=0;i<dpmatrix.length;i++)
        {
            Arrays.fill(dpmatrix[i],0);
        }
        
        for(int i=1;i<dpmatrix.length;i++)
        {
            for(int j=1;j<dpmatrix[0].length;j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                {
                    dpmatrix[i][j]=dpmatrix[i-1][j-1]+1;
                }
                else
                {
                    dpmatrix[i][j]=Math.max(dpmatrix[i][j-1],dpmatrix[i-1][j]);
                }
            }
        }
        return dpmatrix[text1.length()][text2.length()];
        
        
    }
}