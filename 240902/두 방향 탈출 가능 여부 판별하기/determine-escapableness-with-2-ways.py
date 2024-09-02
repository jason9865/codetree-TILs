import sys

n, m = tuple(map(int, sys.stdin.readline().split()))

map_list = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]

visited = [[0 for _ in range(m)] for _ in range(n)]

dr = [0,1]
dc = [1,0]

def in_range(r,c):
    return 0 <= r and r < n and 0 <=c and c < m

def can_go(r,c):
    if not in_range(r,c):
        return False
    if visited[r][c] or map_list[r][c] == 0:
        return False

    return True

def dfs(r,c):
    
    for d in range(2):
        nr = r + dr[d]
        nc = c + dc[d]

        if not in_range(nr,nc) or visited[nr][nc] or map_list[nr][nc] == 0:
             visited[nr][nc] = 1
            dfs(nr,nc)

visited[0][0] = 1
dfs(0, 0)

print(visited[n - 1][m - 1])