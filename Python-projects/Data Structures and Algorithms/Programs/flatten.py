def islist(l):
    return type(l)==type([])


def flatten(l):
    if(len(l)==1):
        if(islist(l[0])):
            result =flatten(l[0])
        else:
            result = l[:]
    elif(len(l)==0):
        return l        
    elif(islist(l[0])):
        result = flatten(l[0])+flatten(l[1:])
    elif(not islist(l[0])):
        result = [l[0]]+flatten(l[1:])
    return result  
              

test = [[1,2],1,3,4,[2,[5,6],3]];
test2 = [1,2,3,(4,5,6)]
print(flatten(test));