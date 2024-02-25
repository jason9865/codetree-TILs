# # 내 풀이  --> 알고리즘 설계 실패
# R,C = tuple(map(int, input().split()))

# arr = [
#     list(input().split())
#     for _ in range(R)
# ]

# init_color = arr[0][0]
# cnt = 0
# middle_color = ''
# for i in range(R):
#     for j in range(C):
#         if init_color == 'W' and arr[i][j] == 'B':
#             cnt += 1
#             middle_color = 'B'
        
#         elif init_color == 'B' and arr[i][j] == ''

# 답지 풀이

# n, m = tuple(map(int, input().split()))
# grid = [
#     input().split()
#     for _ in range(n)
# ]

# cnt = 0
# for i in range(1, n):
#     for j in range(1, m):
#         for k in range(i+1, n - 1):
#             for l in range(j + 1, m-1):
#                 if grid[0][0] != grid[i][j] and \
#                    grid[i][j] != grid[k][l] and \
#                    grid[k][l] != grid[n-1][m-1]:
#                    cnt += 1

# print(cnt)

R,C = tuple(map(int, input().split()))

arr = [input().split() for _ in range(R)]


cnt = 0
for i in range(1,R):
    for j in range(1,C):
        for k in range(i+1,R-1):
            for l in range(j+1,C-1):
                if arr[0][0] != arr[i][j] and \
                   arr[i][j] != arr[k][l] and \
                   arr[k][l] != arr[R-1][C-1]:
                   cnt += 1

print(cnt)