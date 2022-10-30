class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        result =[]
        def backtracking(left, right, currentString):
            if len(currentString) == 2*n:
                result.append(currentString)
                return
            if left < n:
                backtracking(left+1, right, currentString+"(")
            if right < left:
                backtracking(left, right+1, currentString+")")
        backtracking(0,0,"")
        return result

        