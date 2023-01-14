class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        def dfsSearch(searchWord, row, column):
            if len(searchWord) == 0:
                return True
            if row >= len(board) or column >= len(board[0]) or row < 0 or column < 0 or searchWord[0] != board[row][column]:
                return False
            
            temp = board[row][column]
            board[row][column] = "#"
            
            down = dfsSearch(searchWord[1:], row+1, column)
            up = dfsSearch(searchWord[1:], row-1, column)
            right = dfsSearch(searchWord[1:], row, column+1)
            left = dfsSearch(searchWord[1:], row, column-1)
            board[row][column] = temp
            return down or left or right or up
        
        for i in range(len(board)):
            for j in range(len(board[0])):
                if dfsSearch(word, i, j):
                    return True
        return False
            
        