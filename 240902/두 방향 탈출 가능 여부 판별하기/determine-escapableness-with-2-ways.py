import sys

n,m = tuple(map(int, sys.stdin.readline().split()))

map_list = [[map(int, sys.stdin.readline())] for _ in range (n)]

visited = [[False for _ in range(m)] for _ in range(n)]

dr = [1,0,-1,0]
dc = [0,1,0,-1]

ans = 0

def in_range(r,c):
    return 0 <= r and r < n and 0 <=c and c < m

def dfs(r,c):
    if(visited[r][c] == 1):
        ans = 1
        return;
    
    visited[r - 1][c - 1] = True

    for d in range(4):
        nr = r + dr[d]
        nc = c + dc[c]

        if (in_range(nr,nc) is False or visited[nr][nc] or map_list[nr][nc] == 0):
            continue

        visited[nr][nc] = True
        
        dfs(nr,nc)

visited[0][0] = 1
dfs(0,0)

print(ans)