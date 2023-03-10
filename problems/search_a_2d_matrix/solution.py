class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix:
            return False
        rows = len(matrix)
        columns = len(matrix[0])

        startIndex = 0
        endIndex = rows*columns
        
        while startIndex < endIndex:
            middleElement = startIndex + (endIndex - startIndex) // 2

            if target == matrix[middleElement//columns][middleElement%columns]:
                return True
            elif target > matrix[middleElement//columns][middleElement%columns]:
                startIndex = middleElement+1
            else:
                endIndex = middleElement

        return target == matrix[middleElement//columns][middleElement%columns]