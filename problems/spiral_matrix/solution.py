class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
       
        rowStart = 0
        rowEnd = len(matrix)-1
        
        columnStart = 0
        columnEnd = len(matrix[0])-1
        
        result=[]
        
        while rowStart <=rowEnd and columnStart <= columnEnd:
            for i in range(columnStart, columnEnd+1):
                result.append(matrix[rowStart][i])
            rowStart+=1
            
            for i in range(rowStart, rowEnd+1):
                result.append(matrix[i][columnEnd])
            columnEnd-=1
            
            if rowStart <= rowEnd:
                for i in range(columnEnd, columnStart-1, -1):
                    result.append(matrix[rowEnd][i])
            rowEnd-=1
            
            if columnStart <= columnEnd:
                for i in range(rowEnd, rowStart-1, -1):
                    result.append(matrix[i][columnStart])
            columnStart+=1

        return result
                    
                        
                        
        