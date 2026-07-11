df<-data.frame(
  Name=c("ja","ya","na","to","sa"),
  Gender=c("M","F","F",NA,"M"),
  Age=c(22,21,NA,33,NA)
)
print(df)

#finding nan value and mean the nan value,na.rm:remove nan value
mean_age<-mean(df$Age,na.rm=TRUE)
cat (mean_age)

df$Age[is.na(df$Age)]<-mean_age
print(df)

#use median
df2<-data.frame(
  Name=c("ja","ya","na","to","sa","aa","dd","d"),
  Gender=c("M","F","F",NA,"M","F","F","M"),
  Age=c(22,21,NA,300,NA,19,20,23)
)
print(df2)

median_age<-median(df2$Age,na.rm=TRUE)
cat(median_age)

df2$Age[is.na(df2$Age)]<-median_age
print(df2)
