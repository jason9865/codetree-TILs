# Python틱한 함수 익히고 해당문제 숙달하기

MAX_T = 1000000

n,m = tuple(map(int, input().split()))
pos_a, pos_b = [0] * (MAX_T + 1), [0] * (MAX_T + 1)

time_a = 1
for _ in range(n):
    d, t = tuple(input().split())
    
    if d == 'R':
        step = 1
    else:
        step = -1
    
    for _ in range(int(t)):   
        pos_a[time_a] = pos_a[time_a - 1] + step
        time_a += 1

time_b = 1
for _ in range(m):
    d, t = tuple(input().split())
    
    if d == 'R':
        step = 1
    else:
        step = -1
    
    for _ in range(int(t)):
        pos_b[time_b] = pos_b[time_b - 1] + step
        time_b += 1
    
ans = -1
for i in range(1, time_a):
    if pos_a[i] == pos_b[i]:
        ans = i
        break

print(ans)