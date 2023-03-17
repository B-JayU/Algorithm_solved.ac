
while True:
    sentence = input()
    stack = []

    if sentence == '.':
        break

    for c in sentence:
        if c == '(' or c == '[':
            stack.append(c)

        elif c == ')' or c == ']':
            if len(stack) == 0:
                print("no")
                break

            out = stack.pop()
            if c == ')' and out != '(':
                print('no')
                break
            elif c == ']' and out != '[':
                print('no')
                break

        elif c == '.':
            if len(stack) == 0:
                print('yes')

            else:
                print('no')