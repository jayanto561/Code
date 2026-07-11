"hello Iam jayanto"
5+5
plot(1:10)

for(x in 1:10){
  print(x)
}

name<-"jayanto"
age<-33
name
age
print(name)



for(x in 2:10){
  print(x)
}


hi<-"hello kmn acho"
paste("jayanto ",hi)



var<-var1<-var2<-"hi"
var2
class(var)


a<-20L
class(a)
b<-as.numeric(a)
class(b)
c<-as.complex(b)
class(c)

#find the min_max
max(10,22,33,3)
min(22,33,1,44,-22)

sqrt(49)
abs(-2222.44)


ceiling(1.1)
floor(1.9)



cat(name)

#number of character
nchar(name)


#grepl diye oi string ta ache naki check kore
grepl("jaya",name)
grepl("sarker",name)

#paste combin string
l_name<-"Sarker"
paste(name,l_name)
h<-"hello\"ja\"hi by jayanto"
cat(h)
