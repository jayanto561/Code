#=================================================
#               Grading system                      
#=================================================
show_result <-function(marks){

if (marks < 0 || marks > 100) {
  print("Invalid marks")
} else if (marks >= 80) {
  print("A+")
} else if (marks >= 75) {
  print("A")
} else if (marks >= 70) {
  print("A-")
} else if (marks >= 65) {
  print("B+")
} else if (marks >= 60) {
  print("B")
} else if (marks >= 55) {
  print("C")
} else if (marks >= 50) {
  print("C-")
} else if (marks >= 40) {
  print("D")
} else {
  print("Fail")
}
}
show_result(44)
#=================================================
#               convert temp                      
#=================================================
tempconvert<-function(c){
  f<-(c*9/5)+32
  cat("Fahrenheit",f)
  }
tempconvert(66)

#=================================================
#               simple Calculator                      
#=================================================
calculator<-function(a,b,o){
  if(o=="+"){
    print(a+b)
  }else if(o=="-"){
    print(a-b)
  }else if(o=="*"){
    print(a*b)
  }else if(o=="/"){
    print(a/b)
  }else{
    print("invalid")
  }
}
calculator(10,30,"+")
#=================================================
#               Even_odd                      
#=================================================
even_odd<-function(n){
  if(n %% 2==0){
    cat("even")
  }else{
    print("odd")
  }
}
even_odd(34)
#=================================================
#               Max_Min                      
#=================================================
max_min<-function(a,b,c,d,e){
  num<-c(a,b,c,d,e)
  print(paste("max_value",max(num)))
  print(paste("min_value",min(num)))
}
max_min(1,2,3,4,5)

#=================================================
#               Voting Eligibility                      
#=================================================
vot <-function(a,c){
  if(a>=18&&c=="bd"){
    print("can vote")
  }else{
     print("can not vote") 
    }
}
vot(22,"i")

#=================================================
#               Prime                      
#=================================================
is_prime <- function(n) {
  
  if (n <= 1) {
    return("Not Prime")
  }
  
  for (i in 2:(n - 1)) {
    if (n %% i == 0) {
      return("Not Prime")
    }
  }
  
  return("Prime")
}

print(is_prime(3))
print(is_prime(10))

#=================================================
#                 table_Print                  
#=================================================

tablePrint <- function(n){
  for(i in 1:10){
    cat(n,"x",i,"=",n*i,"\n")
  }
}
tablePrint(4)

#=================================================
#                 Factorial                  
#=================================================
factorial <- function(n){
  fact <- 1
  for(i in 1:n){
    fact <- fact*i
  }
  print(fact)
}
factorial(3)

#=================================================
#                Fibonacci Series                 
#=================================================
fibonacci <- function(n) {
  a <- 0
  b <- 1
  
  for (i in 1:n) {
    cat(a, " ")
    
    temp <- a + b
    a <- b
    b <- temp
  }
}

fibonacci(10)

#=================================================
#                BMI Calculator                  
#=================================================

bmi <- function(w,h){
  value <- w/(h^2)
  cat("BMI =", value,"\n")
  if(value < 18.5){
    print("Underweight")
  }else if(value < 25){
    print("Normal")
  }else if(value < 30){
    print("Overweight")
  }else{
    print("Obese")
  }
}
bmi(,1.594)

#=================================================
#                 Area of Circle                  
#=================================================

circle<-function(r){
  area<-3.1416*r*r
  cat("area",area)
}
circle(12)
#=================================================
#                Rectangle Area                  
#=================================================
rectangle<-function(l,w){
  area<-l*w
  cat("area=",area)
}
rectangle(22,2)
#=================================================
#                Simple Interest                  
#=================================================
interest <- function(p,r,t){
  si <- (p*r*t)/100
  cat("Simple Interest =", si)
}
interest(1000,122,13)
#=================================================
#                Electricity Bill                  
#=================================================
bill <- function(unit){
  if(unit <= 100){
    amount <- unit*5
  }else if(unit <= 200){
    amount <- unit*7
  }else{
    amount <- unit*10
  }
  cat("Bill =", amount)
}
bill(122)
#=================================================
#                Average                 
#=================================================
aver<-function(a,b,c,d,e){
  num<-a+b+c+d+e
  cat(num/5)
}
aver(5,5,5,5,5)

#=================================================
#               Output                
#=================================================
sum<-0
for(i in 1:5){  
  if(i%%2==1){
    sum<-sum+i
  }else{
    sum<-sum-i
  }
}
print(sum)


x<-10

if(x>20){
  x<-x/2
}else{
  x<-x*2
}
print(x)


for{
  print(i)
}

