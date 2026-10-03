

student <-data.frame(
   Name =c("jayanto","Rajon","Rakib","Rifat"),
   Age=c(20,19,21,NA),
   Marks = c(22,11,22,NA),
   Department=c("cse","swe",NA,"swe")
  
)
student
head(student)
tail(student)
str(student)
summary(student)
dim(student)

nrow(student)

ncol(student)

names(student)


sum(is.na(student))


#mean
student$Marks[is.na(student$Marks)]<-mean(student$Marks,na.rm=TRUE)
student


#mede

# Removes any row that contains at least one NA/NaN
df_clean <- na.omit(student)
student

student[, "Marks"]
student$Marks
student$Marks
student[student$Department == "CSE", ]


hist(
  student$Marks,
  main = "Marks Distribution",
  xlab = "Marks",
  col = "skyblue"
)

pie(
  table(student$Department),
  main = "Department Distribution"
)
data <- data.frame(
  Hours = c(1, 2, 3, 4, 5, 6),
  Marks = c(40, 45, 52, 60, 68, 75)
)
model <- lm(Marks ~ Hours, data = data)
predict(model, data.frame(Hours = 7))
