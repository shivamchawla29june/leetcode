class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        symbols = ["+", "-", "*", "/"]
        stackOfNumbers = []
        for i in range(len(tokens)):
            if tokens[i] not in symbols:
                stackOfNumbers.append(int(tokens[i]))
            else:
                lastElement = int(stackOfNumbers.pop())
                secondLastElement = int(stackOfNumbers.pop()) 
                if tokens[i] == "+":
                    stackOfNumbers.append(secondLastElement+lastElement)
                elif tokens[i] == "-":
                    stackOfNumbers.append(secondLastElement-lastElement)
                elif tokens[i] == "*":
                    stackOfNumbers.append(secondLastElement*lastElement)
                else:
                    stackOfNumbers.append(int(secondLastElement/lastElement))
        return stackOfNumbers[-1]
                    
                 
        