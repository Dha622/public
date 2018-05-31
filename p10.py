# p10.py
# fall 2012
# david anderson
# lists

from random import *

#1 create list to hold 15 items all set to zero

num = [0]*15

print num

#2 use a for loop to set all items in list equal to 2012

num = [0]*15
for i in range(0,len(num)):
    num[i] = num[i] + 2012

print num

#3 using a for loop add 100 to all items in array

num = [2012]*15
i = 0
for i in range(0, len(num)):
    num[i] = num[i] + 100
print num
print

#4 using a for loop, set all items in array to a random number
# in the range 2012 <= n <= 2030

for i in range(0, len(num)):
    num[i] = randint(2012, 2030)

print num

#5 display the smallest and largest values from the array

largest = num[0]
for i in range(1, len(num)):
    if num[i] > largest:
        largest = num[i]

print "Max =", largest

smallest = num[0]
for i in range(1, len(num)):
    if num[i] < smallest:
        smallest = num[i]

print "Min =", smallest

#6 create a function called avg that returns the average value of
# all items in the array.

# print "avg:", avg(num)

def avg():
    sum = 0
    i = 0
    while i < len(num):
        sum = sum + num[i]
        i = i + 1

    avg = sum / len(num)
    return avg
print "Avg:", avg()

#7 create a function called countRange that takes a list and a min and max
# range and returns a count of the number of list items that are in the
# range count = number of items between m and n inclusive ie. m <= item <= n

# print "2012-2020: " + countRange( num, 2012, 2020 )
# print "2021-2031: " + countRange( num, 2021, 2030 )

def countRange(data, n, m):
    count = 0

    for i in range(0, len(data)):
        if data[i] < m and data[i] > n:
            count = count + 1
    
    return count

print "2023-2030:", countRange(num, 2023, 2030)
print "2012-2022:", countRange(num, 2012, 2022)

#8 Selection Sort function

a = 0
while a < len(num):
    minIndex = a
    b = a + 1
    while b < len(num):
        if num[b] < num[minIndex]:
            minIndex = b
        b = b + 1

    temp = num[a]
    num[a] = num[minIndex]
    num[minIndex] = temp
    a = a + 1	

#display sorted list
print "after selection sort"
print num
