def isUN(n):
    if n < 0 :
        return False
    while n > 1:
        if n%2 == 0 :
            n /= 2
        elif n%3 == 0 :
            n /= 3
        elif n%5 == 0:
            n /= 5
        else:
            return False
    return True
n = int(input())
print("Ugly Number") if isUN(n) else print("Not Ugly Number")
