// LeetCode 258. Add Digits (Easy)
// Link: https://leetcode.com/problems/add-digits/
// Question: num ke digits ka sum karte raho jab tak sirf ek digit na bache. Wo digit return karo.
// Mera approach: Andar wale loop se digits ka sum nikala (n % 10, n / 10). Bahar wala loop tab tak chala jab tak num 10 se chhota (ek digit) na ho.
// Time: O(log n) per pass, kuch hi passes  Space: O(1)

// ---- neeche apna LeetCode code paste karo ----
class Solution {
    public int addDigits(int num) {
      
      while(num>=10){
        int sum=0;
        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        num=sum;
      }
      return num;  
    }
}
