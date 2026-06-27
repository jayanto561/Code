df <- data.frame(
  Gender = c("Male", "Female", "Male", "Female", "Male"),
  Name   = c("Rahim", "Karima", NA, "Sadia", "Nabil"),
  Age    = c(22, NA, 25, 19, NA)
)


print(df)
#find the nan vlaue
mean_age <- mean(df$Age, na.rm = TRUE)
mean_age

#replace the nan value
df$Age[is.na(df$Age)] <- mean_age
print(df)

