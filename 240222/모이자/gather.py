import sys
INT_MAX = sys.maxsize

n = int(input())
arr = list(map(int, input().split()))

hap = INT_MAX
for i in range(1,n+1):
    standard = i

    sum_diff = 0
    for j in range(n):
        diff = abs((j+1) - standard)
        sum_diff += arr[j]*diff
    
    hap = min(hap, sum_diff)

print(hap)