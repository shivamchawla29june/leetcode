class Solution:
    def calculate(self, s: str) -> int:
        i = 0
        current = previous = result = 0
        currentOperator = "+"
        while i < len(s):
            currentChar = s[i]
            if currentChar.isdigit():
                while i< len(s) and s[i].isdigit():
                    current = current*10 + int(s[i])
                    i+=1
            
                i-=1
                
                if currentOperator == "+":
                    result+=current
                    previous = current
                    
                elif currentOperator == "-":
                    result-=current
                    previous = -current
                    
                elif currentOperator == "*":
                    result-= previous
                    result+=(previous*current)
                    previous = previous*current
                    
                elif currentOperator == "/":
                    result-=previous
                    result+=int(previous/current)
                    previous = int(previous/current)
            
                current = 0
                print(result)
            
            elif currentChar != " ":
                currentOperator = currentChar
            i+=1
            
        return result
                
            
                     
            
        
        