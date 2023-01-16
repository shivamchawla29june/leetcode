class Solution:
    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:
        prerequisitesMap = {i: [] for i in range(numCourses)}
        
        for course, prerequiste in prerequisites:
            prerequisitesMap[course].append(prerequiste)
        
        
        result = []
        visitSet, cycle = set(), set()
        
        def dfs(course):
            if course in cycle:
                return False
            if course in visitSet:
                return True
            
            cycle.add(course)
            
            for i in prerequisitesMap[course]:
                if not dfs(i):
                    return False
            cycle.remove(course)
            visitSet.add(course)
            result.append(course)

            return True
        
        for crs in range(numCourses):
            if not dfs(crs):
                return []
            
        return result
        