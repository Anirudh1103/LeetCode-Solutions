class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        len1 = len(word1)
        len2 = len(word2)
        merged = ""
        c1 = c2 = 0
        for i in word1:
            merged +=i
            for j in word2:
                if(c2 == len2):
                    break
                merged += word2[c2]
                c2 += 1
                break
            c1 +=1
        if(len2>len1):
            merged += word2[c2:]
        if(len1>len2):
            merged += word1[c1:]
        return merged

        