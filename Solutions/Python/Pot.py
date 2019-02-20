#! /bin/python3

inputs = int(input())
sum = 0

for i in range(inputs):
    x = int(input())
    sum += int(x/10) ** int(x % 10)

print(sum)
