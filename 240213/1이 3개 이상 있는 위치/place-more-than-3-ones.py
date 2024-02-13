n = int(input())
arr = [tuple(map(int,input().split())) for _ in range(n)]

nx,ny = 0, 0
dxs = [0,1,0,-1]
dys = [1,0,-1,0]

def in_range(x,y,n):
    return 0<=x and x < n and 0<=y and y < n

ans = 0
cnt = 0
for i in range(n):
    for j in range(n):

        for dx, dy in zip(dxs, dys):
            
            nx = i + dx
            ny = j + dy

            if in_range(nx,ny, n) and arr[nx][ny] == 1:
                cnt += 1
                if cnt == 3:
                    ans += 1
                    
            nx = 0
            ny = 0

        cnt = 0

print(ans)