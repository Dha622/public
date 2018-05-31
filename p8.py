# p8.py
# fall 2012
# david anderson
# p8 demonstrates while loops, random, and graphics

from turtle import *
from random import *

title("P8 - David Anderson")


#drawLine function
#draws a line from point a,b to point c,d
def drawLine(a,b,c,d):
    penup()
    goto(a,b)
    pendown()
    goto(c,d)
    penup()
    
#draw a gray box with x,y as top left point
# and w and h as width and height
def drawBox(x,y,w,h):
    colormode(255)
    pencolor(200, 200, 200) #gray
    drawLine(x,y,x+w,y) #top
    drawLine(x+w,y,x+w,y-h) #right
    drawLine(x+w,y-h,x,y-h) #bottom
    drawLine(x,y-h,x,y) #left
    penup()

def drawSpiralBox():
    pendown()
    left(90)
    forward(f)

delay(0)

#+---------------------Part A.-----------------------
#top left box
drawBox(-220, 340, 200, 200)

#part A - use while loop to draw 50 horizontal lines 4 pixels apart
#         your choice of color

y = 340
count = 0
while count < 50:
    color("green")
    drawLine(-220, y, -20, y)
    y = y - 4
    count = count + 1
#+----------------------------------------------------



#+---------------------Part B.------------------------
#top right box
drawBox(20, 340, 200, 200)

#part B - use while loop to draw 21 vertical lines 10 pixels apart
#         your choice of color

x = 20
count = 0
while count < 21:
    color("blue")
    drawLine(x, 340, x, 140)
    x = x + 10
    count = count + 1
#+----------------------------------------------------



#+---------------------Part C.------------------------
#middle left box
drawBox(-220, 100, 200, 200)

#part C - use while loop to draw triangle

color("red")
y = 100
x1 = -220
x2 = -20
count = 0
while count < 200:
    drawLine(x1, y, x2, y)
    x1 = x1 + .5
    x2 = x2 - .5
    y = y - 1
    count = count + 1
#+----------------------------------------------------



#+---------------------Part D.------------------------    
#middle right box
drawBox(20, 100, 200, 200)

#part D - use while loop to draw clockwise spiral

color("black")
goto(220, -100)
f = 198
count = 0
while count < 100:
    drawSpiralBox()
    f = f - 2
    count = count + 1

#+----------------------------------------------------



#+---------------------Part E.------------------------   
#lower left box
drawBox(-220, -140, 200, 200)

#part E - draw horizontal gradient HU Green (25, 101, 54) to black

colormode(255)
y = -140
r = 25
g = 101
b = 54
count = 0
while count < 200:
    pencolor(r, g, b)

    drawLine(-220, y, -20, y)
    y = y - 1

    r = r - (25.0 / 200)
    g = g - (101.0 / 200)
    b = b - (54.0 / 200)
    count = count + 1

#+----------------------------------------------------


#+---------------------Part F.------------------------
#lower right box
drawBox(20, -140, 200, 200)

#part F. draw 50 random colored lines

count = 0
while count < 50:
    a = 120
    b = -240
    c = randint(20, 220)
    d = randint(-340, -140)
    
    red = randint(0, 255)
    green = randint(0, 255)
    blue = randint(0, 255)
    
    pencolor(red, green, blue)
    
    drawLine(a, b, c, d)
    count = count + 1

#+----------------------------------------------------

hideturtle()
exitonclick();
