import sys

n = int(sys.stdin.readline())

list = [*map(int, sys.stdin.readline().split())]

for i in range(n):
    for j in range(n - i - 1):
        if(list[j] > list[j + 1]):
            list[j],list[j + 1] = list[j + 1],list[j]

for n in list:
    print(n, end = " ")