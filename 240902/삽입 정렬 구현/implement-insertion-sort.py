import sys

n = int(sys.stdin.readline())

list = [*map(int, sys.stdin.readline().split())]

for i in range(1, n):
    for j in range(i,0,-1):
        if(list[j] > list[j - 1]):
            break
        list[j],list[j-1] = list[j-1],list[j]

for l in list:
    print(l,end=" ")