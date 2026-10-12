public class Day03 {
    public static void main(String[] args) {
        // Concept: number ulta karna. n % 10 = aakhri digit, n / 10 = aakhri digit hata do.
        // Dry run pehle notebook mein karo: n = 12345 -> reversed = 54321

        // TODO 1: int n = 12345; int reversed = 0; banao.
        //         while (n > 0) loop mein: digit = n % 10; reversed = reversed * 10 + digit; n = n / 10;
        //         Loop ke baad reversed print karo.
        int n=123456;
        int reversed=0;

        while(n>0){
            int digit = n%10;
            reversed=reversed*10+digit;
            n=n/                        10;
        }
        System.out.println(reversed);
        // TODO 2: Ek aur number lo (jaise 121). Reverse karke original se compare karo.
        //         Agar dono barabar hain toh "palindrome" print karo, warna "not palindrome".
        //         (Original number ek alag variable mein save karna, kyunki n loop mein badal jaata hai.)

        int n1=121;
        int rev=0;
        int n2=n1;
        while(n1>0){
            int digit= n1%10;
            rev=rev*10+digit;
            n1=n1/10;
        }
        System.out.println(rev);
        if(rev==n2){
            System.out.println("palindrom");

        }else{
            System.out.println("not palindrom");
        }
    }
}
