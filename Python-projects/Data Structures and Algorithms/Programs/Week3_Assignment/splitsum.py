
def splitsum(l):
    pos_list,neg_list=[],[]
    for i in l:
        if(int(i)<=0):
            neg_list.append(int(i)*int(i)*int(i))
        else:
            pos_list.append(int(i)*int(i))
            
    return [sum(pos_list),sum(neg_list)]      

a=[1,3,-5];
b=[2,4,6];
c=[-19,-7,-6,0];
d=[-1,2,3,-7];
e=[0,0,0]
print(splitsum(d));
print(a[::-1])