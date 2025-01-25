# Climbing-Stairs
You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Explanation:
Use dynamic programming to solve the problem.
Each step can be reached either from (n-1)th step or (n-2)th step.
Maintain two variables to store the number of ways to reach the last two steps and compute iteratively.
