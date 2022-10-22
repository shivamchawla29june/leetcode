class Solution:
    def romanToInt(self, s: str) -> int:
        result=0
        i=len(s)-1
        while(i>=0) :
            if s[i]=="M":
                if (i-1)!=-1 and s[i-1] == "C":
                    result+=900
                    i-=2
                else:
                    result+=1000
                    i-=1
            elif s[i] =="D":
                if (i-1)!=-1 and s[i-1] == "C":
                    result+=400
                    i-=2
                else:
                    result+=500
                    i-=1
            elif s[i] =="C":
                if (i-1)!=-1 and s[i-1] == "X":
                    result+=90
                    i-=2
                else:
                    result+=100
                    i-=1
            elif s[i] =="L":
                if (i-1)!=-1 and s[i-1] == "X":
                    result+=40
                    i-=2
                else:
                    result+=50
                    i-=1
            elif s[i] =="X":
                if (i-1)!=-1 and s[i-1] == "I":
                    result+=9
                    i-=2
                else:
                    result+=10
                    i-=1
            elif s[i] =="V":
                if (i-1)!=-1 and s[i-1] == "I":
                    result+=4
                    i-=2
                else:
                    result+=5
                    i-=1
            else:
                result+=1
                i-=1
        return result

        