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
    if(visited[r - 1][c - 1] == 1):
        ans = 1
        return;
    
    visited[r - 1][c - 1] = True

    for d in range(4):
        nr = r + dr[d]
        nc = c + dc[c]

        if (in_range(nr,nc) is False or visited[nr - 1][nc - 1] or map_list[nr - 1][nc - 1] == 0):
            continue
        
        dfs(nr,nc)

dfs(0,0)

print(ans)