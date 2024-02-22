# 다시
n, m = tuple(map(int, input().split()))

answer = [[0]*m for _ in range(n)]

x,y = 0,0

dxs = [0,1,0,-1]
dys = [1,0,-1,0]

dir_num = 0

def in_range(x,y):
    return 0<=x and x<n and 0<=y and y<m

answer[0][0] = 1

for i in range(2, (n*m)+1):
    nx = x + dxs[dir_num]
    ny = y + dys[dir_num]


    if not in_range(nx,ny) or answer[nx][ny] != 0:
        dir_num = (dir_num + 1) % 4

    x = x + dxs[dir_num]
    y = y + dys[dir_num]
    answer[x][y] = i


for i in range(n):
    for j in range(m):
        print(answer[i][j], end=" ")
    print()