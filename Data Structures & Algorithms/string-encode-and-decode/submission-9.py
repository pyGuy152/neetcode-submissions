class Solution:

    def encode(self, strs: List[str]) -> str:
        if (len(strs) == 0):
            return "-1"
        out = ""
        for i in strs:
            out += str(len(i)) + "#" + i
        return out
    def decode(self, s: str) -> List[str]:
        if (s == "-1"):
            return []
        out = []
        i = 0
        while (i < len(s)):
            j = s.find("#", i)
            length = int(s[i:j])
            out.append(s[j+1:j+1+length])
            i = j + 1 + length
        return out