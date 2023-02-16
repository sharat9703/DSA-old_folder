# def merge(a,b):
#     # a = l[:len(l)//2]
#     # b = l[len(l)//2:len(l)]
#     [C,m,n] = [[],len(a),len(b)]
#     [i,j] = [0,0]
#     while i+j < m+n :
#         if m==i:
#             C.append(b[j])
#             j=j+1
#         elif n==j:
#             C.append(a[i])
#             i=i+1
#         elif a[i] <= b[j]:
#             C.append(a[i])
#             i=i+1
#         elif a[i] > b[j]:
#             C.append(b[j])
#             j=j+1  
#     return C 

# def mergesort(A,l,r):
#     if(r - l <=1):
#         return A[l:r]
#     if(r - l > 1):
#         mid = (l+r)//2
#         L = mergesort(A,l,mid)
#         R = mergesort(A,mid,r)

#         return merge(L,R)     
def merge(a,b):
    [C,m,n]=[[],len(a),len(b)]
    [i,j]=[0,0]
    while i+j <m+n:
        if i==m:
            C.append(b[j])
            j+=1
        elif j==n:
            C.append(a[i])
            i+=1
        elif a[i]<b[j]:
            C.append(a[i])
            i+=1
        elif a[i]>b[j]:
            C.append(b[j])
            j+=1
    return C 

def mergesort(A,l,r):
    if r - l <= 1:
        return A[l:r]
    else:
        mid = (l+r)//2
        L = mergesort(A,l,mid)
        R = mergesort(A,mid,r)

        return merge(L,R)               


l = list(range(110,100,-1))
print(l)
print()
print(mergesort(l,0,len(l)))    

