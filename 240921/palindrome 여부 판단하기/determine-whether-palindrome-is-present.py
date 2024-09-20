def check_string(n):
    leng = len(n)
    for i in range(leng//2):
        if n[i] != n[leng-1-i]:
            print("No")
            return
    print("Yes")
    return


a = input()

check_string(a)