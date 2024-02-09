N,M = tuple(map(int, input().split()))

MAX_A = 30 # 1000*N
MAX_B = 30 # 1000*M

pos_A = [0]*MAX_A
pos_B = [0]*MAX_B

time_A = 1
for i in range(1,N+1):
    d,t = list(input().split())

    for j in range(int(t)):
        pos_A[time_A] = pos_A[time_A-1] + (1 if d == 'R' else -1)
        time_A += 1

time_B = 1
for i in range(1,M+1):
    d,t = list(input().split())

    for j in range(int(t)):
        pos_B[time_B] = pos_B[time_B-1] + (1 if d=='R' else -1)
        time_B += 1


ans = -1
for i in range(1,time_A):
    if pos_A[i] == pos_B[i]:
        ans = i
        break

print(ans)