# # 정리된 풀이
# n = int(input())

# dxs = [0, 1, 0, -1]
# dys = [1, 0, -1, 0] 

# arr = [
#     tuple(map(int, input().split())) for _ in range(n)
# ]

# def in_range(x,y):
#     return x>=0 and x<n and y>=0 and y<n
 
# def adjacent_cnt(i, j):
#     cnt = 0
#     for dx, dy in zip(dxs, dys):
#         nx = i + dx
#         ny = j + dy

#         if in_range(nx,ny) and arr[nx][ny] == 1:
#             cnt += 1
#             if cnt == 3:
#                 cnt = 0
#                 return 1


# ans = 0
# for i in range(n):
#     for j in range(n):
#         if adjacent_cnt(i,j):
#             ans += 1 
        
# print(ans)

# 연습1
n = int(input())

arr = [tuple(map(int, input().split())) for _ in range(n)]
dxs = [0,1,0,-1]
dys = [1,0,-1,0]

def in_range(x,y):
    return 0<=x and x<n and 0<=y and y<n


ans = 0
for i in range(n):
    for j in range(n):
        cnt = 0
        for dx,dy in zip(dxs,dys):
            nx = i + dx
            ny = j + dy

            if in_range(nx, ny) and arr[nx][ny] == 1:
                cnt += 1

            if cnt == 3:
                ans += 1
                cnt = 0


print(ans)