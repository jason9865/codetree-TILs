import sys

word = sys.stdin.readline().strip()

if (word == word[::-1]):
    print("Yes")
else:
    print("No")