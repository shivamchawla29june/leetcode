class Solution:
    def kthSmallest(self, matrix: List[List[int]], k: int) -> int:
        minElement = matrix[0][0]
        maxElement = matrix[len(matrix)-1][len(matrix)-1]
        
        def countEqualOrLess(element):
            counting = 0
            column = len(matrix)-1
            row = 0
            while row < len(matrix) and column >=0:
                if matrix[row][column] <= element:
                    counting+=column+1
                    row+=1
                else:
                    column-=1
            return counting
        
        while minElement != maxElement:
            midElement = (minElement+maxElement)//2
            count = countEqualOrLess(midElement)
            # print(midElement, count)
            if count < k:
                minElement = midElement+1
            else:
                maxElement = midElement
                
        return minElement