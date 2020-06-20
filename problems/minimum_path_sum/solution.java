class Solution {
    public int minPathSum(int[][] grid) {
        if(grid==null || grid.length==0 || grid[0].length==0) return 0;
        
        int[][] result = new int[grid.length][grid[0].length];
        result[0][0]=grid[0][0];
        
        for(int i=1;i<result[0].length;i++)
        {
            result[0][i]=result[0][i-1]+grid[0][i];
        }
        for(int i=1;i<result.length;i++)
        {
            result[i][0]=result[i-1][0]+grid[i][0];
        }
        for(int i=1;i<result.length;i++)
        {
            for(int j=1;j<result[0].length;j++)
            {
                result[i][j]=Math.min(result[i-1][j],result[i][j-1])+grid[i][j];
            }
        }
        return result[result.length-1][result[0].length-1];   
    }
}