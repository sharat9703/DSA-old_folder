def selectionsort(l):

    for start in range(len(l)):
        minpos = start
        for i in range(start,len(l)):
            if l[i]<l[minpos]:
                minpos = i
        (l[start],l[minpos]) = (l[minpos],l[start])

    return l;

print(selectionsort([9,1,34,23,2,7,37,91,124,65,45,78]))    