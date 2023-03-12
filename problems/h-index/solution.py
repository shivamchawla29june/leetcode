class Solution:
    def hIndex(self, citations: List[int]) -> int:
        hIndexCitation = [0]*(len(citations)+1)
        for i in citations:
            if i > len(citations):
                hIndexCitation[len(citations)]+=1
            else:
                hIndexCitation[i]+=1

        total=0
        for i in range(len(hIndexCitation)-1,-1,-1):
            total+=hIndexCitation[i]
            if total >= i:
                return i
        
        return 0