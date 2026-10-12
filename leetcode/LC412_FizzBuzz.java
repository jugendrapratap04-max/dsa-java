// LeetCode 412. Fizz Buzz (Easy)
// Link: https://leetcode.com/problems/fizz-buzz/
// Question: 1 se n tak strings ka list. 3 and 5 dono se divisible: FizzBuzz, sirf 3: Fizz, sirf 5: Buzz, warna number string.
// Mera approach: 1 se n tak loop. Pehle 3 aur 5 dono ka check (FizzBuzz), phir sirf 3 (Fizz), sirf 5 (Buzz), warna number ko string banaya.
// Time: O(n)  Space: O(n) (result list)

// ---- neeche apna LeetCode code paste karo ----
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result= new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5==0){
                result.add("FizzBuzz");
        }else{
            if(i%3==0){
                result.add("Fizz");
            }else if(i%5==0){
                result.add("Buzz");
            }else{
                result.add(String.valueOf(i));
            }
        }
        }
        return result;
    }
    
    }
