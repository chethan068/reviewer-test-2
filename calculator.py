# FORCE_RISK
# This comment forces the High Risk flag for the demo

def divide_numbers(a, b):
    # Potential ZeroDivisionError not handled
    return a / b

def bad_function():
    try:
        x = 1
    except:
        # Bare except is a bad practice in Python
        pass

print(divide_numbers(10, 0))
