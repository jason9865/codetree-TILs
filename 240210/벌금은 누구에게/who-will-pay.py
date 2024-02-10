N,M,K = tuple(map(int, input().split()))

student_list = [0]*(N+1)

ans = -1
for i in range(M):
    fee = int(input())
    student_list[fee] += 1

    if student_list[fee] == K:
        ans = fee
        break

print(ans)