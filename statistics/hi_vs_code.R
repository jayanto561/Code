print("hi")
cat("Hello, World!\n")
sum <- 0

for (x in 1:5) {
  print(x)
  
  if (x %% 2 == 0) {
    sum <- sum + x
  }
}

print(paste("Total sum of the loop:", sum))
