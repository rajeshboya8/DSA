s=input().split()
l=[]
for i in range(len(s)):
    if(s[i].isnumeric()):
        l.append(s[i])
l.sort()
print("+".join(l))
