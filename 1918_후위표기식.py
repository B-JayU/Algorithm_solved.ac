import sys
infix = list(sys.stdin.readline().rstrip())


def postfix(infix):
    stack = list()

    for i in range(len(infix)):
        if infix[i] == "(":
            stack.append(infix[i])
        elif infix[i] == "+" or infix[i] == "-":
            while stack and stack[-1]!='(':
                print(stack.pop(), end="")
            stack.append(infix[i])
        elif infix[i] == "*" or infix[i] == "/":
            while stack and stack[-1] != '(' and (stack[-1] == "*" or stack[-1] =='/'):
                print(stack.pop(), end="")
            stack.append(infix[i])
        elif infix[i] == ")":
            while stack and stack[-1] != '(':
                print(stack.pop(), end="")
            stack.pop()
        elif 'A' <= infix[i] <= 'Z':
            print(infix[i], end="")

    if len(stack) >0:
        for i in range(len(stack)):
            print(stack.pop(), end="")


postfix(infix)
