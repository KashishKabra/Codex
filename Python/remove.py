string = input("Enter a string: ")
n = int(input("Enter the number of characters to remove: "))
if len(string) < n:
    print("Error: String is too short.")
else:
    new_string = string[n:]
    print("The new string is:", new_string)