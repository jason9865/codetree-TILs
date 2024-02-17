# 내가 간과한점 : 바로 이전과 같은위치가 아닌 상태에서 속도 역전이 일어나는 경우
# MAX_T = 1000*1000
# N,M = tuple(map(int, input().split()))

# # MAX_T로 수정할것
# pos_A = [0]*MAX_T
# pos_B = [0]*MAX_T

# time_A = 1
# for i in range(N):
#     v, t = tuple(map(int,input().split()))

#     for j in range(t):
#         pos_A[time_A] = pos_A[time_A-1] + v
#         time_A += 1


# time_B = 1
# for i in range(M):
#     v, t = tuple(map(int,input().split()))

#     for j in range(t):
#         pos_B[time_B] = pos_B[time_B-1] + v
#         time_B += 1

# # print(pos_A[30:60])
# # print(time_A)
# # print(pos_B[30:60])

# cnt = 0
# for i in range(1,time_A):
#     if i != 1 and pos_A[i] != pos_B[i] and pos_A[i-1] == pos_B[i-1]:

#         cnt += 1
#         # print("case:1")
#         # print(pos_A[i-1] ,pos_A[i],pos_A[i+1])
#         # print(pos_B[i-1] ,pos_B[i],pos_B[i+1])
    
#     elif pos_A[i-1] < pos_B[i-1] and pos_A[i] > pos_B[i]:
#         cnt += 1
#         # print("Case2")
#         # print(pos_A[i-1] ,pos_A[i],pos_A[i+1])
#         # print(pos_B[i-1] ,pos_B[i],pos_B[i+1])

#     elif pos_A[i-1] > pos_B[i-1] and pos_A[i] < pos_B[i]:
#         cnt += 1
#         # print("case3")
#         # print(pos_A[i-1] ,pos_A[i],pos_A[i+1])
#         # print(pos_B[i-1] ,pos_B[i],pos_B[i+1]) 


# print(cnt)

# 답지풀이 익히기



MAX_T = 1000*1000

N, M = tuple(map(int, input().split()))
pos_A = [0]*(MAX_T + 1)
pos_B = [0]*(MAX_T + 1)

time_A = 0
for _ in range(N):
    v,t = tuple(map(int, input().split()))
    
    for i in range(1,t+1):
        time_A += 1
        pos_A[time_A] = v + pos_A[time_A-1]

time_B = 0
for _ in range(M):
    v,t = tuple(map(int, input().split()))

    for i in range(1,t+1):
        time_B += 1
        pos_B[time_B] = v + pos_B[time_B-1]
        

# 챙겨야할 로직: 리더를 정하고 위치에따라 갱신
leader, ans = 0, 0
for i in range(1, time_A+1):

    if pos_A[i] > pos_B[i]:
        if leader == 2:
            ans += 1
        
        leader = 1

    elif pos_B[i] > pos_A[i]:
        if leader == 1:
            ans += 1
        
        leader = 2

print(ans)