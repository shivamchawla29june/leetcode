
class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        
        boardSet = set()
        for i in range(len(board)):
            for j in range(0,9):
                if board[i][j] != ".":
                    rowString = board[i][j]+"in row"+str(i)
                    columnString = board[i][j]+"in column"+str(j)
                    boxString = board[i][j]+"in block"+str(int(i/3))+ "and"+str(int(j/3))
                    
                    if rowString in boardSet or columnString in boardSet or boxString in boardSet:
                        return False
                    boardSet.add(rowString)
                    boardSet.add(columnString)
                    boardSet.add(boxString)
        return True        
                
        