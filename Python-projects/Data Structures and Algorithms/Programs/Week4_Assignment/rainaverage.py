def rainaverage(l):
    # initialise a dictionary
    d = {}
    # map all the values accordingly 
    for item in l:
        if item[0] in d:
            d[item[0]].append(item[1])
        else:
            d[item[0]]=[item[1]]
    # initialising a result list
    res = []   
    # d = sorted(d)
    # mapping all values accordingly
    for i in d:
        ar = sum(d[i])/len(d[i])
        res.append(tuple([i,ar]))
    res.sort()
    return res         

    
print(rainaverage([(1,2),(1,3),(2,3),(1,1),(3,8)]))    
print(rainaverage([('Bombay',848),('Madras',103),('Bombay',923),('Bangalore',201),('Madras',128)]))
# [('Bangalore', 201.0), ('Bombay', 885.5), ('Madras', 115.5)])