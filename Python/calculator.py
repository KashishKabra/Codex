def addition(a,b):
    return a+b
def subtract():
    return a-b
def multiply(a,b):
    return a*b
def division(a,b):
    return a/b
print("Select operation.")
print("1.Add")
print("2.Subtract")
print("3.Multiply")
print("4.Divide")
while True:
    ch = input("Enter choice: ")
    if ch in ('1', '2', '3', '4'):
        num1 = float(input("Enter first number: "))
        num2 = float(input("Enter second number: "))
        if ch == '1':
            print(num1, "+", num2, "=", addition(num1, num2))

        elif ch == '2':
            print(num1, "-", num2, "=", subtract(num1, num2))

        elif ch == '3':
            print(num1, "*", num2, "=", multiply(num1, num2))

        elif ch == '4':
            print(num1, "/", num2, "=", division(num1, num2))
        
        calc = input("Continue(yes/no):")
        if calc == 'no':
            break

    else:
        print("Invalid input")
     