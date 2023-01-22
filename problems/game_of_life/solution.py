class Solution:
    def gameOfLife(self, board: List[List[int]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        maxRow = len(board)
        maxColumn  = len(board[0])
        
        def countNeigbors(row, column):
            neight = 0
            for i in range(row-1,row+2):
                for j in range(column-1, column+2):
                    if (i==row and j == column) or i <0 or j < 0 or i == maxRow or j == maxColumn:
                        continue
                    if board[i][j] in [1,3]:
                        neight+=1
            return neight
        
        for row in range(maxRow):
            for column in range(maxColumn):
                neighbors = countNeigbors(row, column)
                if board[row][column]:
                        if neighbors == 2 or neighbors == 3:
                            board[row][column] =3
                else:
                    if neighbors == 3:
                        board[row][column] = 2
                        
        for row in range(maxRow):
            for column in range(maxColumn):
                if board[row][column] == 1:
                    board[row][column] = 0
                elif board[row][column] == 2 or board[row][column] == 3:
                    board[row][column] = 1
        

            
            
            
        