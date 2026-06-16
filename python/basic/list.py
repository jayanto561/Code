listapp=[1,3,4,6,3]
print(listapp[0])

fruit=["apple","banana","grapes","orange","mango"]
print(fruit[0:2])
print(fruit[-3:-1])
print(fruit[0:6:2])
print(fruit[-1:-5:-1])

print(fruit+["berry","kiwi"])
print(fruit*2)
print(fruit)


fruit[0]="papaya"
print(fruit)


fruit1=["apple","banana","grapes","orange","mango"]
fruit1.append("berry")
print(fruit1)
fruit1.clear()

fruit2=["apple","banana","grapes","orange","mango"]
fruit2.count("apple")
fruit.extend(fruit2)

fruit2.insert(2,"kiwi")
fruit2.pop(3)
print(fruit2)
fruit2.remove("kiwi")
print(fruit2)
fruit2.reverse()
print(fruit2)

fruit2.sort(reverse=True)
print(fruit2)