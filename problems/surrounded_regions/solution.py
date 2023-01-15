class Solution:
    def solve(self, board: List[List[str]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        # def dfsSolver(row, column):

        #     if row == 0 or column == 0 or row == len(board) -1 or column == len(board[0]) -1:
        #         if board[row][column] == "X":
        #             return True
        #         else:
        #             return False
            
        #     if board[row-1][column] != "X":
        #         board[row][column] = "X"
        #         if not dfsSolver(row-1, column):
        #             board[row][column] = "O"
        #             return False
        #         board[row][column] = "O"
                
        #     if board[row+1][column] != "X":
        #         board[row][column] = "X"
        #         if not dfsSolver(row+1, column):
        #             board[row][column] = "O"
        #             return False
        #         board[row][column] = "O"
                
        #     if board[row][column-1] != "X":
        #         board[row][column] = "X"
        #         if not dfsSolver(row, column-1):
        #             board[row][column] = "O"
        #             return False
        #         board[row][column] = "O"
                
        #     if board[row][column+1] != "X":
        #         board[row][column] = "X"

        #         if not dfsSolver(row, column+1):
        #             if row == 2 and column == 3:
        #                 print(" I am here")
        #             board[row][column] = "O"
        #             return False
        #         board[row][column] = "O"
            
        #     board[row][column] = "X"
        #     return True
        
        # for i in range(1, len(board) - 1):
        #     for j in range(1, len(board[0]) - 1):
        #         if board[i][j] == "O" :
        #             print(i,j)
        #             dfsSolver(i,j)
        
        def dfsSolver(row, column):
            if row < 0 or column < 0 or row > len(board) -1 or column > len(board[0]) -1 or board[row][column] != "O":
                return
            board[row][column] = "T"
            dfsSolver(row+1, column)
            dfsSolver(row-1, column)
            dfsSolver(row, column-1)
            dfsSolver(row, column+1)
            
        for i in range(len(board)):
            for j in range(len(board[0])):
                if (i == 0 or j == 0 or i == len(board) -1 or j == len(board[0]) -1) and board[i][j] == "O":
                    dfsSolver(i,j)

        for i in range(len(board)):
            for j in range(len(board[0])):
                if board[i][j] == "O":
                    board[i][j] = "X"
        
        for i in range(len(board)):
            for j in range(len(board[0])):
                if board[i][j] == "T":
                    board[i][j] = "O"
        