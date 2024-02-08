n = int(input())
cnt = 1
matrix = []
cnt_list = []
for i in range(n):
    a = int(input())
    matrix.append(a)

for i in range(n):
    if i != 0 and matrix[i] == matrix[i-1]:
        cnt += 1
    else:
        cnt_list.append(cnt)
        cnt = 1
cnt_list.append(cnt)

# print(max(cnt_list))
max_cnt = 0

for i in range(len(cnt_list)):
    if max_cnt < cnt_list[i]:
        max_cnt = cnt_list[i]

print(max_cnt)