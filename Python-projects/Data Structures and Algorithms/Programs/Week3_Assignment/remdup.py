def remdup(l):
    if len(l)<=1:
        return l
    else:
        nl=[]
        for i in range(0,len(l)):
            j=i
            for j in range(j,len(l)-1):
                if(l[i]==l[j+1]):
                    break;
            else:
                nl.append(l[i])        

        return nl        
    
a=[3,5,7,5,3,7,7,5,10];
b=[3,1,3,5];
c=[3,5,7,5,3,7,10];
d=[2,2,3,4,5,3,5]
e=[1,2,1]
print(remdup(d));                