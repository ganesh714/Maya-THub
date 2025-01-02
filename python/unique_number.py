def isUN(n):
    str = "1234567890"
    for i in range(0,len(n)):
        if n[i] not in str:
            return False
        else:
            str = str[:i] + 'a' + str[i+1:]
    return True

print("Unique Number") if isUN(input()) else print("Not Unique Number")
