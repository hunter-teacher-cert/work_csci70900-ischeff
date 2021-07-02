# CGOL - animated!

## Goal: to animate Cgol

## Process:

We played around with animate.java, and realized that the control character and delay method were the most essential pieces. (We could get the animaniacs line to print as expected by just looping the control character on the delay.)

We applied this to cgol by adding the stripped-down version of the animate method (with just the control character and no other print statements) and the delay method, then calling animate from main, and passing it the number of generations over which the loop would iterate.

To adjust the speed of the animation, you can just increase or decrease the hardcoded value passed to delay. (It was originally set to 1000 ms but for more generations it helps to do 500 ms.)
