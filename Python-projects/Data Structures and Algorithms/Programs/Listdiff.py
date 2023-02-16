def list_diff(a,b):
    [C,m,n] = [[],len(a),len(b)];
    [i,j]=[0,0]
    while(i+j<m+n):
          
          if(a[i]==b[j]):
            j+=1
          elif(a[i]!=b[j]):
            C.append(a[i])
            i+=1            
                 

    return C

print(list_diff([1,2,3,4],[1,3,4,5,7]))