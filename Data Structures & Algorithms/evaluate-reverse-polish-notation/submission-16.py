class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []
        for e in tokens : 
            if (e not in {"+", "-", "*", "/"}) : 
                stack.append(int(e))
            else : 
                res = stack.pop() 
                s = stack.pop()
                match e : 
                    case "+" : res += s
                    case "-" : res = s - res
                    case "*" : res *= s
                    case "/" : res = int (s /res)
                stack.append(res)
        return 0 if not stack else stack.pop()
