def sum_of_digits(n):
    
    if n == 0:
        return 0
    else:
        # Recursive case
        return n % 10 + sum_of_digits(n // 10)


# Function to convert a decimal number to binary using recursion
def decimal_to_binary(n):
    
    if n == 0:
        return "0"
    elif n == 1:
        return "1"
    else:
        
        return decimal_to_binary(n // 2) + str(n % 2)


# Testing the functions
number = 1234
decimal = 19

print(f"Sum of digits of {number} is: {sum_of_digits(number)}")
print(f"Binary representation of {decimal} is: {decimal_to_binary(decimal)}")