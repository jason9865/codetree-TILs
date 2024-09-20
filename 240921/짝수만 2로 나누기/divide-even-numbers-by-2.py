import sys

def change(num):
    if (num % 2 == 0):
        return int(num/2)
    return num
    

n = sys.stdin.readline()
list = [*map(change,[*map(int,sys.stdin.readline().split())])]
for n in list:
    print(n,end=" ")