class Solution:
    def fractionToDecimal(self, numerator: int, denominator: int) -> str:
        quotient, remainder = divmod(abs(numerator), abs(denominator))
        sign = "-" if numerator*denominator < 0 else ""
        result = sign + str(quotient)
        if remainder == 0:
            return result
        
        remainderDict = {}
        decimal = ""
        i=0
        
        while remainder > 0 and remainder not in remainderDict:
            remainderDict[remainder] = i
            newQuotient,remainder = divmod(remainder*10, abs(denominator))
            decimal+=str(newQuotient)
            i+=1
            
        if remainder in remainderDict:
            i = remainderDict[remainder]
            return result + "." + decimal[:i] + "(" + decimal[i:] + ")"

        return result + "." + decimal[:]
        
        
        