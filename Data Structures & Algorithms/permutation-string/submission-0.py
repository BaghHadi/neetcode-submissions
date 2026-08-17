class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        M1 = {}
        M2 = {}
        l,r = 0,len(s1)
        for i in range(len(s1)) :
            M1[s1[i]]= M1.get(s1[i],0)+1
        while r<=len(s2) :
            for i in range(l, r):
                M2[s2[i]]= M2.get(s2[i],0)+1
            if (M1 == M2 ) : 
                return True 
            else : 
                l+=1
                r+=1
                M2.clear()
        return False
