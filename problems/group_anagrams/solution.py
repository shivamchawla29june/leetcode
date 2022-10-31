class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if len(strs) == 0: return [[]]
        storedAnagrams = {}
        for str in strs:
            sortedStr = ''.join(sorted(str))
            if sortedStr in storedAnagrams:
                storedAnagrams[sortedStr].append(str)
            else:
                storedAnagrams[sortedStr] = [str]
        return storedAnagrams.values()
        
        