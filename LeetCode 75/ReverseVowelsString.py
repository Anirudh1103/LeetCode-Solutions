class Solution:
  def reverseVowels(self, s: str) -> str:
    def listToString(lst):
        str = ""
        for ele in lst:
            str += ele
        return str
    vowels = "aeiouAEIOU"
    chars = list(s)
    indicies = []
    count = 0
    c = 0
    for i in chars:
        if i in vowels:
            count+=1
            indicies.append(i)
        c+=1
    count = count - 1
    c = 0
    for i in chars:
        if i in vowels:
            chars[c] = indicies[count]
            count-=1
        c += 1
    return(listToString(chars))
        

