a,b,c,d = tuple(map(int,input().split()))

time_a = a*60 + b
time_b = c*60 + d

elapsed_time = time_b - time_a

print(elapsed_time)