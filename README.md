# SoloAlgorithmsProject2
This Project demonstrates my knowledge and mastery in Network Flow Algorithms.

Honors Algorithms Course - Mining Problem  
This is a substantially harder version than the one given out at the National Progamming Team Competition.  
Students are not allowed to share their work WITH EACH OTHER. All work is to be done alone.  
California State University - Long Beach  

You are a mining engineer and have the following problem presented to you.  
There is a rectangular two-dimensional pit of known width and depth. Using  
various engineering techniques, the compositions of all of the blocks of ore in  
the pit have been determined. Each block has a value and a cost to extract it  
from the ground. It’s net value is the difference between these two. In order  
to remove a block from the ground, every block that is strictly above it (in the  
vertical direction only) must also be removed. Your goal is to determined which  
ore blocks to remove from the ground so as to maximize the revenue of your  
company.  
Blocks are all exact rectangles of height 1. The input file will be called  
pit.txt. Each line of the input file will consist of a list of bricks separated by  
commas. Each brick will be a 3-tuple of nonnegative integers representing in  
order:  
(width of the block, value of the block, cost it would take to remove it)  
For example, an input file might look like the following.  
(1,13,20),(2,3,7),(3,19,17),(2,0,1),(1,4,17),(1,13,15)  
(2,3,10),(4,3,17),(1,1,13),(1,2,5),(1,18,18),(1,0,3)  
(3,39,19),(2,10,1),(3,31,12),(1,33,6),(1,9,16)  
(1,11,19),(1,0,1),(1,0,2),(2,0,7),(1,8,16),(4,4,10)  
(1,0,9),(2,10,4),(2,17,15),(1,0,10),(1,0,5),(3,0,3)  
Note that the sum of the widths of all the blocks in any given row is equal  
to the same number, 10 in this example. Think of the top line, beginning with  
(1,13,20), as ground level. Note that excavating that block will cost 20 but only  
yield a profit of 13. However, in order to get to the block beneath, it will need  
to be taken out.  
Output will be in the file blocks.txt. You will indicate which blocks are to be  
excavated so as to yield the maximum profit for your company. Each block on  
each line has a number assigned to it, starting from 0 on the left. The optimal  
solution for the example above is as follows.  
0,1,2,3,4  
0,1,2,3,4  
0,1,2,3  
1,2  
1  
Note that each line corresponds to a line in the input file. For example, at  
ground level, we excavate every block except for the last one on the far right.  
At the bottom of the pit, we only remove the second block from the left. The  
total profit from this excavation is 19.  
