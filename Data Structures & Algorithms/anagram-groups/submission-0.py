class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        out = [[strs.pop(0)]]
        while (len(strs) != 0):
            s = strs.pop(0)
            n = True
            for i in range(len(out)):
                if ("".join(sorted(out[i][0])) == "".join(sorted(s))):
                    out[i].append(s)
                    n = False
            if (n):
                out.append([s])
        return out

        
        
        