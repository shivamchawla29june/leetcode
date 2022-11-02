
from re import L


class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        
        if len(intervals) ==0:
            return intervals
        
        intervals.sort(key = lambda x:x[0])
        answer = [intervals[0]]
        currentInterval = intervals[0]
        
        for i in range(len(intervals)):
            if intervals[i][0] <= currentInterval[1]:
                answer[-1][1] = max(intervals[i][1], currentInterval[1])
            else:
                if intervals[i][1]>currentInterval[1]:
                    answer.append(intervals[i])
            currentInterval = answer[-1]
        return answer
            
        
        