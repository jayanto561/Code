
count = 0
while count < 6:
    print(count,"hi")
    count +=1
print("bye")

print("\n")

i =0
while i<5:
    print(i,"stop the loop")
    if i==3:
        break
    i+=1

print("\n")

j=0
while j<5:
    j+=1
    if j==3:
        continue
    print(j,"only not print one element")
    
print("\n")   

#sum of all odd number:
n=int(input("enter the number:"))
sum=0
i=1
while i<=n:
    if i%2!=0:
        sum+=i
    i+=1
print("sum of all odd numbers:",sum)
print("\n")

print("\n")
#for loop:

for i in "banana":
    print(i)

print("\n")
#list

fruits=["apple","banana","cherry"]
for x in fruits:
    print(x)

print("\n")
#break statement in for loop
name=["jayanto","sabit","ovi"]
for x in name:
    print(x)
    if x=="sabit":
        break

print("\n")
#continue statement in for loop
name=["jayanto","sabit","ovi"]
for x in name:
    if x=="sabit":
        continue
    print(x)
    


