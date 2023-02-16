def matched(s):
    count =0;
    i=0;
    while(i<len(s) and count>=0):
      if(s[i]=="("):
         count= count+1
      if(s[i]==")"):
         count= count-1
      i=i+1
    return count==0;        

print(matched("(((()))"))    

           

#
# make list of brackets
# intitialise count =0

#if while count=0 and c[idx] == ''
# 
#  
# #