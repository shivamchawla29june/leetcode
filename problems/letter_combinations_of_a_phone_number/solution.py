class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        #Backtracking Recursively
        # if len(digits) == 0: return []
        # result=[]
        # mapping = {'2': 'abc', '3': 'def', '4': 'ghi', '5': 'jkl', '6': 'mno', '7': 'pqrs', '8': 'tuv', '9': 'wxyz'}
        # def backtracking(index, currentString):
        #     if index == len(digits):
        #         result.append(currentString)
        #         return
        #     for char in mapping[digits[index]]:
        #         backtracking(index+1, currentString+char)
        
        # backtracking(0, "")
        # return result
    
        # Iteratively Combine
        if len(digits) == 0: return []
        result=[""]
        mapping = {'2': 'abc', '3': 'def', '4': 'ghi', '5': 'jkl', '6': 'mno', '7': 'pqrs', '8': 'tuv', '9': 'wxyz'}
        for i in range(len(digits)):
             while len(result[0]) == i:
                permutation = result.pop(0)
                for j in mapping[digits[i]]:
                    result.append(permutation + j)
        return result
                    
                
        