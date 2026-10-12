// LeetCode 9. Palindrome Number (Easy)
// Link: https://leetcode.com/problems/palindrome-number/
// Question: integer x diya hai. Seedha aur ulta same padhe toh true, warna false. Negative number palindrome nahi.
// Mera approach: Negative ho toh false. Warna original x1 mein save kiya, digits ulte karke r banaya, phir x1 se compare kiya.
// Time: O(log x)  Space: O(1)

// ---- neeche apna LeetCode code paste karo ----
class Solution {
    public boolean isPalindrome(int x) {
        int x1=x;
       if(x<0){
        return false;
       } else {
        int r=0;
        while(x>0){
            int digit=x%10;
            r=r*10+digit;
            x=x/10;
        }
        if(x1==r){
            return true;
        }else{
            return false;
        }
       }
    }
}
