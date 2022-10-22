class Solution:
    def isValid(self, s: str) -> bool:
        data = {'}':"{", "]": "[", ")": "("}
        stack =[]
        for i in range(len(s)):
            if s[i] not in data:
                stack.append(s[i])
            else:
                if len(stack)==0 or stack.pop()!=data[s[i]]:
                    return False
        return False if len(stack)!=0 else True
        