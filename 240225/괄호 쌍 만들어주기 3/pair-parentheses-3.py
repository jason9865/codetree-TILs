# # 내 풀이
# n = input()
# # ) ( ( ) ( ) )

# count = 0

# for i in range(len(n)):
#     if n[i] == '(':
#         for j in range(i,len(n)):
#             if n[j] == ')':
#                 count += 1

# print(count)

# # 답지 풀이 이게 더 쉬움
# string = input()
# n = len(string)

# cnt = 0
# for i in range(n):
#     for j in range(i + 1, n):
#         if string[i] == '(' and string[j] == ')':
#             cnt += 1

# print(cnt)

arr = input()
n = len(arr)
count = 0

for i in range(n):
    if arr[i] == '(':
        for j in range(i,n):
            if arr[j] == ')':
                count += 1

print(count)