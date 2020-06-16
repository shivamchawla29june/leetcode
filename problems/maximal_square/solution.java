class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0) return 0;
        int[][] dpmatrix= new int[matrix.length+1][matrix[0].length+1];
        int result=0;
        for(int i=0;i<matrix.length+1;i++)
        {
            Arrays.fill(dpmatrix[i],0);
        }
        for(int i=1;i<dpmatrix.length;i++)
        {
            for(int j=1;j<dpmatrix[0].length;j++)
            {
                if(matrix[i-1][j-1]=='0')
                {
                    dpmatrix[i][j]=0;
                }
                else
                {
                    dpmatrix[i][j]=1+Math.min(dpmatrix[i-1][j-1],Math.min(dpmatrix[i-1][j],dpmatrix[i][j-1]));
                }
                result=Math.max(result,dpmatrix[i][j]);
            }
        }
        return result*result;
    }
}