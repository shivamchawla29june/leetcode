class Solution:
    def longestIncreasingPath(self, matrix: List[List[int]]) -> int:
        dp ={}
        
        def dfs(row, column, prevVal):
            if row < 0 or column < 0 or row == len(matrix) or column == len(matrix[0]) or matrix[row][column] <= prevVal:
                return 0
            if (row, column) in dp:
                return dp[(row, column)]
            result = 1
            
            result = max(result, 1 + dfs(row+1, column, matrix[row][column]), 1 + dfs(row-1, column, matrix[row][column]), 1 + dfs(row, column+1, matrix[row][column]), 1 + dfs(row, column-1, matrix[row][column]))
            
            dp[(row, column)] = result
            return result
        
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                dfs(i, j, -1)
                
        return max(dp.values())
                
                
        
                
        