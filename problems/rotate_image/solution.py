class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        # start = 0
        # end = len(matrix)-1
        # while start < end:
        #     matrix[start], matrix[end] = matrix[end], matrix[start]
        #     start+=1
        #     end-=1
        
        for i in range(len(matrix)):
            for j in range(i):
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]
                
        for i in range(len(matrix)):
            leftColumn = 0
            rightColumn = len(matrix)-1
            while leftColumn < rightColumn:
                matrix[i][rightColumn], matrix[i][leftColumn] = matrix[i][leftColumn], matrix[i][rightColumn]
                leftColumn+=1
                rightColumn-=1

        