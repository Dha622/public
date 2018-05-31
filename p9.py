# p9.py
# fall 2012
# david anderson
# takes fullname and make a username

from random import *


def getUserName(fullname):
    lower = fullname.lower()

    space = len(lower)-1
    while lower[space] != " ":
        space = space - 1      
    
    letters = lower[0] + lower[space + 1: space + 5]
    randomNumbers = str(randint(0,9)) + str(randint(0,9)) + str(randint(0,9)) + str(randint(0,9))
    
    return letters + randomNumbers

print getUserName("Ronald McDonald") #rmcdo
print
print getUserName("David H. Anderson") #dande
print
print getUserName("Steve Jobs") #sjobs
print
print getUserName("Michael Jordan") #mjord
print
print getUserName("Tin Can") #tcan
print
