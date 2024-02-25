# # 내풀이
# n = int(input())
# arr = list(map(int, input().split()))

# # 1 2 3 4 5

# count = 0
# for i in range(n):
#     for j in range(i+1,n):
#         for k in range(j+1,n):
#             if arr[i]<=arr[j] and arr[j] <= arr[k]:
#                 count += 1

# print(count)

#답지 풀이
# n = int(input())
# arr = list(map(int, input().split()))

# cnt = 0
# for i in range(n):
#     for j in range(i+1, n):
#         for k in range(j + 1, n):
#             if arr[i] <= arr[j] and arr[j] <= arr[k]:
#                 cnt += 1

# print(cnt)



n = int(input())
arr = tuple(map(int, input().split()))

cnt = 0
for i in range(n):
    for j in range(i+1,n):
        for k in range(j+1,n):
            if arr[i]<=arr[j] and arr[j]<=arr[k]:
                cnt += 1

print(cnt)