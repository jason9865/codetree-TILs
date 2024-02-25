# 다시풀기
# 굳이 standard변수설정 할 필요 없었음
# for문의 i,j 인덱스 처리할때 숫자가 다소 햇갈렸음

# import sys
# INT_MAX = sys.maxsize

# n = int(input())
# arr = list(map(int, input().split()))

# hap = INT_MAX
# for i in range(1,n+1):
#     standard = i

#     sum_diff = 0
#     for j in range(n):
#         diff = abs((j+1) - standard)
#         sum_diff += arr[j]*diff
    
#     hap = min(hap, sum_diff)

# print(hap)

import sys

INT_MAX = sys.maxsize

n = int(input())
arr = tuple(map(int, input().split()))

min_dist = INT_MAX
# 기준이 되는 숫자
for i in range(n):
    sum_diff = 0
    for j in range(n):
        sum_diff += abs(i-j)*arr[j]
    
    min_dist = min(min_dist, sum_diff)

print(min_dist)