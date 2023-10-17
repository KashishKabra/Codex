str1 = input("Enter a string : ")
length = len(str1)
occur = {}
if length <2:
    print("too short")
else:
    for i in range(length):
        c=0
        for j in str1:
            if str1[i]==j:
                c=c+1
            occur[str1[i]]=c
    print(occur)
    sorted_items = sorted(occur.items(), key=lambda x: x[1], reverse=True)
    print(sorted_items)
    print("The second-most occurring character is:", sorted_items[1][0])
