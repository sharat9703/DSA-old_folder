def rotatelist(l,k):
    r=k%len(l)
    if(r==0 or k<0):
        nl = l
        return nl
    else:            
        nl = l[1:]
        nl.append(l[0])
        if(r>1):
            i=0
            while(i!=r-1):
                tl=nl[1:]
                tl.append(nl[0])
                nl=tl
                i=i+1
        return nl          
     
def listman(l):

    c = l[:]
    c.remove(5)
    return c

print(rotatelist([1,2,3],2));