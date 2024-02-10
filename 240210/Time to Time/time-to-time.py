a,b,c,d = tuple(map(int,input().split()))

# time_a = a*60 + b
# time_b = c*60 + d

# elapsed_time = time_b - time_a

# print(elapsed_time)


elapsed_time = 0
while True:

    if a == c and b == d:
        print(elapsed_time)
        break
    
    b += 1
    elapsed_time += 1

    if b == 60:
        a += 1
        b = 0