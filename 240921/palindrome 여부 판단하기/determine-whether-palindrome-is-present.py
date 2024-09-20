import sys

word = sys.stdin.readline()

def check(word):
    for i in range(len(word)):
        if(word[i] != word[len(word) - i - 1]):
            print("No")
            return;
    print("Yes")

check(word)