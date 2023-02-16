def matrixflip(m,d):
     l=m.copy()    
     if d=='h':
         nl=[]
         for i in l:
             nl = nl+ [i[::-1]]
         return nl    
     elif d=='v':
         return l[::-1]    
# [[1,2],[3,4]] =>  [1,2]    h=>   [2,1]   => [[2,1],[4,3]]
#                   [3,4]          [4,3]   
#                            v=>   [3,4]   => [[3,4],[1,2]]
#                                  [1,2] 
myl=[[1,2,3],[4,5,6],[7,8,9]]
myl1=[[1,2],[3,4]]
myl2=[[1]]
myl3 = []
print(matrixflip(matrixflip(myl,'h'),'v'))
# print(reverse([1,2,3,4,5]))
