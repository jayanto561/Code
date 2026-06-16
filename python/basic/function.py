def my_function(fname):
  print("Hello from a function",fname)

my_function("Jayanto")
my_function("Sarkar")
my_function("Python")


def my_name(fname, lname):
  print(fname, lname)

name=input("Enter your first name: ")
last_name=input("enter your last name: ")
my_name(name, last_name)


#defoult parameter value
def my_country(country="Not select any country"):
    print("I am from", country)
my_country("India")
my_country("USA")
my_country()    
my_country("uk")



def c_function(c1, c2, c3):
    print("only print child 1,c1")
c_function(c1="child1", c2="child2", c3="child3")   


def doc_function(a, b):
    """This is a docstring. It provides information about the function."""
    return a + b        
print(doc_function(5, 10))
print(doc_function.__doc__)


lambda_function = lambda x: x * x* x
print(lambda_function(5))   

def square(x):
    return x * x
num=[1, 2, 3, 4, 5]
result = list(map(square, num))
print(result)


def fit_age(age):
    if age < 18:
        return False
    else:
        return True
age = [5, 12, 17, 18, 25, 30]
result = list(filter(fit_age, age))
print(result)