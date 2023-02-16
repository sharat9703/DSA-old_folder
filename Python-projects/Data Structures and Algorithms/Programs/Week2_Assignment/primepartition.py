def isPrime(m):
  if m==2:
    return True
  if m%2==0:
    return False
  return all(m%x>0 for x in range(3,int(m**0.5)+1,2))


def primeNums(m):
    primes = [2]
    primes.extend([x for x in range(3,m+1,2) if isPrime(x)])
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