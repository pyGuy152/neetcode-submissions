class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if (len(s) != len(t)):
            return False;
        for i in s:
            if (t.count(i) >= 1):
                t = t[:t.index(i)] + t[t.index(i)+1:]
        if (len(t)>0):
            return False
        return True
