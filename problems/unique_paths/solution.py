class Solution:
    
    def uniquePaths(self, m: int, n: int) -> int:
#         count = 0
#         def dfsTraversal(i,j):
#             nonlocal count
#             if i == m-1 and j == n-1:
#                 count+=1
#                 return
            
#             if i < m and j < n:
#                 dfsTraversal(i+1, j) # Down
#                 dfsTraversal(i,j+1) # Right
        
#         dfsTraversal(0,0)
#         return count
    
        dpMatrix = [[1]*n for _ in range(m)]
        for i in range(1,m):
            for j in range(1,n):
                dpMatrix[i][j] = dpMatrix[i-1][j] + dpMatrix[i][j-1]
        return dpMatrix[m-1][n-1]
    
                    
    
        