class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0) return false;
        
        int row= matrix.length;
        int column = matrix[0].length;
        
        int start=0;
        int end=row*column-1;
        
        int row_exp=0;
        int col_exp=0;
        int mid=0;
        
        while(start<=end)
        {
            mid=start+(end-start)/2;
            row_exp=mid/column;
            col_exp=mid%column;
            if(matrix[row_exp][col_exp]==target) return true;
            if(matrix[row_exp][col_exp]<target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        
        return false;
    }
}