# emulating l.index(x) with custom function

def findpos(l,v):
   pos = -1
   for i in range(len(l)):
     if(l[i]==v):
        pos = i
        break
   return pos 

print(findpos([2,3,4,5,6,7,8,9],1))        