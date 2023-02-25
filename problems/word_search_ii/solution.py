class Solution:
    def findWords(self, board: List[List[str]], words: List[str]) -> List[str]:
        res = []
        trie = {}
        r,c = len(board), len(board[0])
        def update(word, delta):
            curr = trie
            for ch in word:
                if ch not in curr:
                    curr[ch] = {0: 0}
                curr = curr[ch]
                curr[0] += delta # count
            curr[-1] = word # end of the word

        def dfs(node, i, j):
            ch = board[i][j]
            if ch not in node or not node[ch][0]:
                return
            board[i][j] = '' # backtracking
            node = node[ch]
            if i: dfs(node, i-1, j) # valid coord
            if j: dfs(node, i, j-1) # valid coord
            if i + 1 < r: dfs(node, i+1, j) # valid coord
            if j + 1 < c: dfs(node, i, j+1) # valid coord
            board[i][j] = ch # backtracking
            if node.get(-1, None): # found word
                res.append(node[-1])
                update(node[-1], -1) # remove word
                del node[-1]

        for word in words:
            update(word, 1) # insert word
 
        for i in range(r):
            for j in range(c):
                dfs(trie, i, j)
        return res
