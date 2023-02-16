#Naive Euclid's Algorithm

def GCD(m,n):
    if(n>m):
        (m,n) = (n,m)
    if(m%n==0):
        return n
    else:
        diff = m-n
        return GCD(max(n,diff),min(n,diff))

print(GCD(64,44))            