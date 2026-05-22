
class Person:
    def __init__(self, first_name, last_name):
        self.first_name = first_name
        self.last_name = last_name
    def display(self):
        print("First Name:", self.first_name,)
        print("Last Name:", self.last_name)
n1 = Person("Jayanto", "Sarker")
n1.display()


class Student(Person):
    pass

s1= Student("J", "Sarker")
s1.display()