MAX_T = 1000*1000
N,M = tuple(map(int, input().split()))

# MAX_T로 수정할것
pos_A = [0]*MAX_T
pos_B = [0]*MAX_T

time_A = 1
for i in range(N):
    v, t = tuple(map(int,input().split()))

    for j in range(t):
        pos_A[time_A] = pos_A[time_A-1] + v
        time_A += 1


time_B = 1
for i in range(M):
    v, t = tuple(map(int,input().split()))

    for j in range(t):
        pos_B[time_B] = pos_B[time_B-1] + v
        time_B += 1

# print(pos_A)
# print(time_A)
# print(pos_B)

cnt = 0
for i in range(1,time_A):
    if i != 1 and pos_A[i] != pos_B[i] and pos_A[i-1] == pos_B[i-1]:
        cnt += 1

print(cnt)