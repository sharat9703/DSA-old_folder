def list_diff(a,b):
    [C,m,n] = [[],len(a),len(b)];
    [i,j]=[0,0]
    while(i+j<m+n and i<m and j<n):
       
          if(a[i]==b[j]):
            i+=1
          if(a[i]!=b[j]):
            C.append(a[i])
            i+=1
                      
    return C

print(list_diff([1,2,3,4],[1,3,4,5,7]))