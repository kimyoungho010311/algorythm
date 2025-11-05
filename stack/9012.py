t = int(input())


for _ in range(t):
  s = input().strip()
  stack = []
  valid = True

  for ch in s:
    if ch == '(':
      stack.append(ch)
    else:
      if not stack:
        valid = False
        break
      stack.pop()
  if stack:
    valid = False
  
  print("YES" if valid else "NO")