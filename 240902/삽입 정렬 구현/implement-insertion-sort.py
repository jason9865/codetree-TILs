import sys

n = int(sys.stdin.readline())

list = [*map(int, sys.stdin.readline().split())]

for i in range(1, n):
    j, key = i - 1, list[i]
    while j >= 0 and list[j] > key:
        list[j + 1] = list[j]
        j -= 1
    list[j + 1] = key

for l in list:
    print(l,end=" ")