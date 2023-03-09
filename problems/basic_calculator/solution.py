class Solution:
    def calculate(self, s: str) -> int:
        result = 0
        num = 0
        sign = 1
        stack = []
        for characterString in s:
            if characterString.isdigit():
                num = 10*num + int(characterString)
            elif characterString in ["-", "+"]:
                result += sign*num
                num = 0
                if characterString == "+":
                    sign = 1
                else:
                    sign = -1
            elif characterString == "(":
                stack.append(result)
                stack.append(sign)
                sign, result = 1, 0
            elif characterString == ")":
                result += sign*num
                result *= stack.pop()
                result += stack.pop()
                num = 0
        return result + num*sign
                


        
