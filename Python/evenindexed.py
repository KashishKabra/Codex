str1 = input("Enter a string: ")
length = len(str1)
for i in range(length):
    if(i%2==0):
        print(str1[i])
    else:
        continue
 