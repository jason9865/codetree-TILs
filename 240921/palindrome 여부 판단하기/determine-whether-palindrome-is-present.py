import sys

word = sys.stdin.readline()

def check(word):
    for i in range(int(len(word)/2)):
        if(word[i] != word[len(word) - i - 1]):
            print("No")
            return;
    print("Yes")

check(word)