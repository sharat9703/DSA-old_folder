def factors(n):
    c=[]
    for i in range(1,n+1):
        if(n%i==0):
            c.append(i)
    return c

def isprime(n):
    b = False
    if(len(factors(n))==2):
        b = True
    return b

def primeupton(n):
    primes=[]
    for i in range(2,n):
        if(isprime(i)):
          primes.append(i)          
    return primes      

print(primeupton(8)) 

