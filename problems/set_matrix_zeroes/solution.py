class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        # row=set()
        # column =set()
        # for i in range(len(matrix)):
        #     for j in range(len(matrix[0])):
        #         if matrix[i][j] == 0:
        #             row.add(i)
        #             column.add(j)
         
        # for j in range(len(matrix[0])):        
        #     for i in row:
        #         matrix[i][j] =0
        # for j in range(len(matrix)):
        #     for i in column:
        #         matrix[j][i] = 0
        firstRow = False
        firstColumn = False
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                if matrix[i][j] == 0:
                    matrix[0][j] = 0
                    matrix[i][0] = 0
                    if i == 0:
                        firstRow = True
                    if j == 0: 
                        firstColumn = True
        
        for i in range(1, len(matrix)):
            if matrix[i][0] == 0:
                for j in range(1, len(matrix[0])):
                    matrix[i][j] = 0
                    
        for i in range(1, len(matrix[0])):
            if matrix[0][i] == 0:
                for j in range(1, len(matrix)):
                    matrix[j][i] = 0
                    
        if firstRow == True:
            for i in range(len(matrix[0])):
                matrix[0][i] = 0
        if firstColumn == True:
            for i in range(len(matrix)):
                matrix[i][0] = 0 
                
            
                        