class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1) > len(s2):
            return False
        M1 = {}
        M2 = {}
        for i in range(len(s1)):
            M1[s1[i]] = M1.get(s1[i], 0) + 1
            M2[s2[i]] = M2.get(s2[i], 0) + 1
            
        if M1 == M2:
            return True
        l = 0
        for r in range(len(s1), len(s2)):
            M2[s2[r]] = M2.get(s2[r], 0) + 1
            M2[s2[l]] -= 1
            if M2[s2[l]] == 0:
                del M2[s2[l]]
            l += 1
            if M1 == M2:
                return True
        return False