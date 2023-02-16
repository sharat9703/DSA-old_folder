def quicklysort(A,l,r):
     # base case 
    if r-l <=1:
        return()
     # partition wrt pivot A[l]
    else:
     yellow = l+1
     for green in range(l+1,r):
        if A[green]<=A[l]:
            (A[yellow],A[green])= (A[green],A[yellow])
            yellow= yellow + 1
     # move into pivot
     (A[l],A[yellow-1]) = (A[yellow-1],A[l])
     # recursive calls
     quicklysort(A,l,yellow-1)
     quicklysort(A,yellow,r)
    

def quicksort(l):
    quicklysort(l,0,len(l))
    return l


test1 = [1,43,23,12,65,22,123,324,301,234,34]
print(quicksort(test1))
# quicksort(test1,0,len(test1))
# print(test1)            
# quicksort is generally unstable ...So, proper care is advised..
# ans = list(map(quicksort(test1,0,len(test1)),))
# print(ans)