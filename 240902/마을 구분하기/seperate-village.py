n = int(input())
grid = [
    list(map(int, input().split()))
    for _ in range(n)
]

visited = [
    [0 for _ in range(n)]
    for _ in range(n)
]

dr = [1,0,-1,0]
dc = [0,1,0,-1]

count = 0
number = 0

answer = []

def in_range(r,c):
    return 0 <= r and r < n and 0 <= c and c < n

def can_go(r,c):
    if not in_range(r,c):
        return False
    
    if visited[r][c] == 1 or grid[r][c] == 0:
        return False
    
    return True

def dfs(r,c):
    global number

    for d in range(4):
        nr = r + dr[d]
        nc = c + dc[d]

        if can_go(nr,nc):
            visited[nr][nc] = 1
            number += 1
            dfs(nr,nc)

for i in range(n):
    for j in range(n):
        if grid[i][j] == 1 and not visited[i][j] :
            visited[i][j] = 1
            count += 1
            number = 1
            dfs(i,j)
            answer.append(number)

print(count)
answer.sort()
for num in answer:
    print(num)