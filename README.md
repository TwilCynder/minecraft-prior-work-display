# Prior Work Display
A Minecraft mod that displays the "Prior Work Penalty", also known as "Repair Cost", of items that have been fused in an anvil.  

### The what ?

This "penalty" is a hidden value added to the amount of levels it costs to fuse an item, growing exponentially everytime an item is fused.   
How it works : each items has a "previous repairs count" that starts at 0 when crafted, and the result of an anvil fusion (even if it doesn't "repair" any durability) has a count equal to the highest count of the two items + 1. To put it simply, each fusion increases the count of the most-already-fused item by 1.  

Repairs count|Added cost
-|-
1|1
2|3
3|7
4|15
5|31

### What does this mod do
Really just display this hidden value in the tooltip of any item with a count of 1 or more. 
