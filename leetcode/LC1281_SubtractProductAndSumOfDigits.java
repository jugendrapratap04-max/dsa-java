// LeetCode 1281. Subtract the Product and Sum of Digits of an Integer (Easy)
// Link: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
// Question: n ke digits ka product minus digits ka sum return karo.
// Mera approach: Digit loop (n % 10, n / 10) mein har digit ko sum mein jodha aur product mein guna kiya, phir product - sum return kiya.
// Time: O(log n)  Space: O(1)

// ---- neeche apna LeetCode code paste karo ----
class Solution {
    public int subtractProductAndSum(int n) {
       int product = 1;
       int sum = 0;
       int digit;
       while(n!=0){
        digit=n%10;
        sum=sum+digit;
        product=product*digit;
        n=n/10;
       }
       return(product-sum);
    }
}
