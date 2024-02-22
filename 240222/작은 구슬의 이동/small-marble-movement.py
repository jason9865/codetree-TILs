# dxs, dys = [0, 1, -1, 0], [1, 0, 0, -1]

# mapper = {
#     'R': 0,
#     'D': 1,
#     'U': 2,
#     'L': 3
# }

# c_dir = 'D'
# move_dir = mapper[c_dir]

# x, y = 0, 0
# nx, ny = x + dxs[move_dir], y + dys[move_dir]

# n, t = tuple(map(int, input().split()))
# r,c,d = tuple(input().split())
# r = int(r)
# c = int(c)

# dxs = [0,1,-1,0]
# dys = [1,0,0,-1]

# mapper = {
#     'R': 0,
#     'D': 1,
#     'U': 2,
#     'L': 3
# }
# c_dir = d
# move_dir = mapper[c_dir]

# def in_range(x,y):
#     return x>=0 and x<n and y>=0 and y<n

# nx = r-1
# ny = c-1

# time = 0

# while(1):
#     if time == t:
#         break

#     nx += dxs[move_dir]
#     ny += dys[move_dir]

#     if not in_range(nx,ny):
#         move_dir = 3 - move_dir
#         nx += dxs[move_dir]
#         ny += dys[move_dir]
#         time += 1

#     else:
#         time +=1

    
# print(nx+1, ny+1)

# 답지의 simulation 부분 집중
# 방향을 돌릴때도 시간이 가는데 그것을 어떻게 처리할지가 고민이었음
n, t = tuple(map(int, input().split()))
# r행 c열 d방향
r, c, d = tuple(input().split())

dxs = [0,1,-1,0]
dys = [1,0,0,-1]

mapper = {
    'R':0,
    'D':1,
    'U':2,
    'L':3
}

def in_range(x,y):
    return 0<=x and x<n and 0<=y and y<n

x , y = int(r)-1 ,int(c)-1
c_dir = mapper[d]

for _ in range(t):
    nx = x + dxs[c_dir]
    ny = y + dys[c_dir]

    # 벽 부딪치치x
    if in_range(nx,ny):
        x = nx
        y = ny
        
    # 벽 부딪침
    else:
        c_dir = 3 - c_dir
    

print(x+1, y+1)