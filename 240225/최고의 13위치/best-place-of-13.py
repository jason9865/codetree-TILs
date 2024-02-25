# # 내 풀이
# n = int(input())

# arr = [
#     list(map(int,input().split()))
#     for _ in range(n)
# ]

# max_coin_num = 0
# for i in range(n):
#     for j in range(n-2):
#         max_coin_num = max(max_coin_num,arr[i][j] + arr[i][j+1]+ arr[i][j+2])

# print(max_coin_num)

# 답지 풀이
# n = int(input())
# arr = [
#     list(map(int, input().split()))
#     for _ in range(n)
# ]

# max_cnt = 0
# for i in range(n):
#     for j in range(n-2):
#         cnt = arr[i][j] + arr[i][j+1] + arr[i][j+2]
#         max_cnt = max(max_cnt, cnt)

# print(max_cnt)

n = int(input())
arr = [list(map(int,input().split())) for _ in range(n)]

max_cnt = 0
for i in range(n):
    for j in range(n-2):
        max_cnt = max(max_cnt, arr[i][j]+arr[i][j+1]+arr[i][j+2])

print(max_cnt)