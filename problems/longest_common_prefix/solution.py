class TrieNode:
    def __init__(self, letter):
        self.letter = letter
        self.children = {}
        self.isEndOfWord=False

class Trie:
    def __init__(self):
        self.root = TrieNode("*")
        
    def printTrie(self):
        print(root.children)
        
    def addWord(self, word):
        currentNode = self.root
        for letter in word:
            if letter not in currentNode.children:
                currentNode.children[letter] = TrieNode(letter)
            currentNode=currentNode.children[letter]
        currentNode.isEndOfWord = True
    
    def doesWordExist(self, word):
        if len(word) == 0:
            return True
        currentNode=self.root
        for letter in word:
            if letter not in currentNode.children:
                return False
            currentNode = currentNode.children[letter]
        return currentNode.isEndOfWord
    
    def lowestCommonPrefix(self):
        result=""
        if(len(self.root.children) > 1):
            return ""
        currentNode = self.root
        while len(currentNode.children)==1 and currentNode.isEndOfWord == False :
            result+=currentNode.letter
            element=list(currentNode.children.keys())[0]
            currentNode = currentNode.children[element]
        result+=currentNode.letter
        return result
            
class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        trie = Trie()
        for str in strs:
            trie.addWord(str)
        lowestCommon = trie.lowestCommonPrefix()
        return lowestCommon[1:]
        # if(len(strs) == 0):
        #     return ""
        # pre = strs[0];
        # i = 1;
        # while(i < len(strs)):
        #     while strs[i].find(pre) == -1 and len(pre)>0:
        #         pre = pre[:len(pre)-1]
        #     if(len(pre)==0):
        #         return ""
        #     i+=1;
        # return pre
            
        