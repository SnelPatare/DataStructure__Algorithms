class Solution:
    def isValid(self, s: str) -> bool:
        dictionary = {'}':'{',']':'[',')':'('}
        stack = []

        for i in s:
            if i not in dictionary:
                if i == '{' or i == '[' or i == '(':
                    stack.append(i)
            else:
                if not stack or stack.pop() != dictionary[i]:
                    return False
        return not stack

        