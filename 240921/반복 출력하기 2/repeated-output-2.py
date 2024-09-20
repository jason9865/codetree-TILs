n = int(input())

def say_hello(n):
    if(n == 0):
        return;
    print("HelloWorld")
    say_hello(n-1)

say_hello(n)