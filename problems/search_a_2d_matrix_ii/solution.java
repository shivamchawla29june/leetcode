class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0) return false;
        
        int row= matrix.length-1;
        int column = matrix[0].length-1;

        int r=0;
        int c=column;
        while(r<=row && c>=0)
        {
            if(target==matrix[r][c]) return true;
            if(target>matrix[r][c])
            {
                r++;
            }
            else
            {
                c--;
            }            
        }
        return false;
        
    }
}