class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        
        def dfsSolver(row, column):
            if row < 0 or column < 0 or row >=len(grid) or column >= len(grid[0]):
                return
            
            grid[row][column] = "#"
            if row+1 < len(grid) and grid[row+1][column] == "1":
                dfsSolver(row+1, column)
            if row-1 >=0 and grid[row-1][column] == "1":
                dfsSolver(row-1, column)
            if column+1 < len(grid[0]) and grid[row][column+1] == "1":
                dfsSolver(row, column+1)
            if column-1 >= 0 and grid[row][column-1] == "1":
                dfsSolver(row, column-1)
                 
        countOfIslands = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == "1":
                    dfsSolver(i,j)
                    countOfIslands+=1
        return countOfIslands
        
        