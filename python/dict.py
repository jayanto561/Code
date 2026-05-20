thisdict = {
  "brand": {"1": "Ford", "2": "Chevy", "3": "Dodge"},
  "model": "Mustang",
  "year": 1964,
  "year": 2026
}
print(thisdict["brand"]["3"])
print(thisdict)
print(thisdict.get("name", "Not Found"))