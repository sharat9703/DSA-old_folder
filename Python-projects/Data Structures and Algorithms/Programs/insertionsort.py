def insertionsort(l):
    
    for sliceEnd in range(len(l)):
         pos =sliceEnd
         while(pos >0 and l[pos]>l[pos-1]): 
               l[pos],l[pos-1]=l[pos-1],l[pos]
               pos-=1
    return l


print(insertionsort([9,1,34,23,2,7,37,91,124,65,45,78]))  

