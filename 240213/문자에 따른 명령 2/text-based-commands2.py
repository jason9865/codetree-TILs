order = input()
x,y= 0,0

dx = [1, 0, -1 ,0]
dy = [0, -1, 0, 1]

dir_num = 3

for i in order:
    
    if i == 'L':
        dir_num = (dir_num -1 + 4) % 4
    
    elif i == 'R':
        dir_num = (dir_num + 1) % 4
    
    elif i == 'F':
        x += dx[dir_num]
        y += dy[dir_num]

print(x, y)