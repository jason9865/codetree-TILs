N = int(input())
x, y = 0, 0
dx = [1, 0, -1, 0]
dy = [0, -1, 0, 1]

for _ in range(N):
    d, s = tuple(input().split())
    s = int(s)

    if d == 'E':
        x = x + dx[0]*s
        y = y + dy[0]*s
    elif d == 'S':
        x = x + dx[1]*s
        y = y + dy[1]*s
    elif d == 'W':
        x = x + dx[2]*s
        y = y + dy[2]*s
    elif d == 'N':
        x = x + dx[3]*s
        y = y + dy[3]*s

print(x, y)