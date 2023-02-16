def primeNums(m):
    primes = []
    for i in range(2,m+1):
        for p in range(2,i):
            if i%p == 0:
                break;
        else:        
            primes.append(i)

    return primes

def primepartition(m):
    if(m<0):
        return False
    else:
        primes = primeNums(m)    

        for i in primes:
            y=m-i
            if y in primes:
                return True
            
        return False 


print(primepartition(17))        