// LeetCode 2520. Count the Digits That Divide a Number (Easy)
// Link: https://leetcode.com/problems/count-the-digits-that-divide-a-number/
// Question: num ke kitne digits aise hain jo num ko poora divide karte hain (remainder 0)?
// Mera approach: Original num ko num1 mein save kiya. Loop se har digit nikala; digit 0 nahi hai aur num1 % digit == 0 ho toh counter badhaya.
// Time: O(log n)  Space: O(1)

// ---- neeche apna LeetCode code paste karo ----
class Solution {
    public int countDigits(int num) {
        int r=0;
        int num1= num;
    while(num!=0){
        int last_digit=num%10;
        if(last_digit!=0){
        if(num1%last_digit==0){
            r++;
        }
        }
        num = num/10;
    }
    return r;
    }
}
