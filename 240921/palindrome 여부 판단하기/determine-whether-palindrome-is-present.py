import sys

word = sys.stdin.readline().strip()

def check(word):
    n = len(word)
    for i in range(n//2):
        if(word[i] != word[n- i - 1]):
            print("No")
            return;
    print("Yes")
    return

check(word)