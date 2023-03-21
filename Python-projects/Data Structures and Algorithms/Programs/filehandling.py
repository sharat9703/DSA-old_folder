def filehandling(inp,out):
    infile = open(inp,"r")
    outfile = open(out,"w")

    for l in infile.readlines():
          outfile.write(l)
    infile.close()
    outfile.close()

filehandling("./input.txt","./output.txt")


