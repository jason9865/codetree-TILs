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

n, t = tuple(map(int, input().split()))
r,c,d = tuple(input().split())
r = int(r)
c = int(c)


dxs = [0,1,-1,0]
dys = [1,0,0,-1]

mapper = {
    'R': 0,
    'D': 1,
    'U': 2,
    'L': 3
}
c_dir = d
move_dir = mapper[c_dir]

def in_range(x,y):
    return x>=0 and x<n and y>=0 and y<n

nx = r-1
ny = c-1

time = 0

while(1):
    if time == t:
        break

    nx += dxs[move_dir]
    ny += dys[move_dir]

    

    if not in_range(nx,ny):
        move_dir = 3 - move_dir
        nx += dxs[move_dir]
        ny += dys[move_dir]
        time += 1

    else:
        time +=1

    
print(nx+1, ny+1)