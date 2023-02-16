def linSearch(arr,item):
    n=len(arr)
    for i in range(0,n):
        if arr[i] == item:
            return "Item found at "+str(i)+"."


k=linSearch([1,2,3,5],3)
print(k)            

