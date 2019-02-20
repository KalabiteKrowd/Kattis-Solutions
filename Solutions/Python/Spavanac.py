#!/bin/python3

hour, minutes = input().split()
hour = int(hour)
minutes = int(minutes)

if (minutes < 45):
    hour -= 1
    minutes += 60

if (hour < 0):
    hour += 24

minutes -= 45

print(str(hour) + " " + str(minutes))
