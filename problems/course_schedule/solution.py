class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        prerequisitesMap = {i: [] for i in range(numCourses)}
        
        for course, prerequiste in prerequisites:
            prerequisitesMap[course].append(prerequiste)
            
        visitSet = set()
        
        def dfs(course):
            if course in visitSet:
                return False
            if prerequisitesMap[course] == []:
                return True
            
            visitSet.add(course)
            for i in prerequisitesMap[course]:
                if not dfs(i):
                    return False
            visitSet.remove(course)
            
            prerequisitesMap[course] = []
            return True
        
        for crs in range(numCourses):
            if not dfs(crs):
                return False
            
        return True
        