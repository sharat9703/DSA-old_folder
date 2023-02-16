def binarysearch(arr,query,left,right):
    if(left>right):
      return False

    elif(right>=left):
        mid = (right+left)//2
        if(arr[mid]==query):
          return 'True. Index found at '+str(mid)+'.'
        elif(arr[mid]>query):
            return binarysearch(arr,query,left,mid-1)
        else:
            return binarysearch(arr,query,mid+1,right)
         
ar = [1,2,3,4,5,7]
print(binarysearch(ar,8,0,len(ar)-1))
