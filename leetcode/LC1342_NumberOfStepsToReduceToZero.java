// LeetCode 1342. Number of Steps to Reduce a Number to Zero (Easy)
// Link: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
// Question: num diya hai. Even ho toh 2 se divide, odd ho toh 1 minus. Zero tak kitne steps lage?
// Mera approach: Jab tak num 0 na ho: even ho toh 2 se divide, odd ho toh 1 minus, har baar steps +1.
// Time: O(log n)  Space: O(1)

// ---- neeche apna LeetCode code paste karo ----
class Solution {
    public int numberOfSteps(int num) {
        int steps=0;
        while(num!=0){
        if (num%2==0){
            num = num/2;
            steps++;
        }else{
            num=num-1;
            steps++;
        }
        }
        return steps;
    }
}
