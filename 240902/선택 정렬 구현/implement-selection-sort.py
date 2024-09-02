import sys

n = int(sys.stdin.readline())
list = [*map(int, sys.stdin.readline().split())]


for i in range(n - 1):
    idx = i
    for j in range(i + 1, n):
        if(list[j] < list[idx]):
            idx = j
    list[i],list[idx] = list[idx],list[i]

for l in list:
    print(l, end = " ")