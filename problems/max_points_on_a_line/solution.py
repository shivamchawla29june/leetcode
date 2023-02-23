class Solution:
    def maxPoints(self, points: List[List[int]]) -> int:
        result = 1
        for i in range(len(points)):
            firstPoint = points[i]
            count = collections.defaultdict(int)
            for j in range(i+1, len(points)):
                secondPoint = points[j]
                if secondPoint[0] == firstPoint[0]:
                    slope = float("inf")
                else:
                    slope = (secondPoint[1] - firstPoint[1])/(secondPoint[0] - firstPoint[0])
                count[slope]+=1 
                result = max(result, count[slope]+1)
        return result
        