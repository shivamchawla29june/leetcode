class Solution:
    def ladderLength(self, beginWord: str, endWord: str, wordList: List[str]) -> int:
        if endWord not in wordList:
            return 0
        
        neighbors = collections.defaultdict(list)
        wordList.append(beginWord)
        for word in wordList:
            for position in range(len(word)):
                pattern = word[:position] + "*" + word[position+1:]
                neighbors[pattern].append(word)
        visit = set([beginWord])
        q = deque([beginWord])
        result = 1
        
        while q:
            for i in range(len(q)):
                word = q.popleft()
                if word == endWord:
                    return result
                
                for j in range(len(word)):
                    pattern = word[:j] + "*" + word[j+1:]
                    for neighborWord in neighbors[pattern]:
                        if neighborWord not in visit:
                            visit.add(neighborWord)
                            q.append(neighborWord)
                            
            result+=1
        return 0
                
        
        