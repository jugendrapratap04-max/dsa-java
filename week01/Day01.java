public class Day01 {
    public static void main(String[] args) {
        // 1. Printing
        System.out.println("Hello, Java!");
        System.out.print("print() line nahi todta, ");
        System.out.println("println() todta hai.");

        // 2. Variables + data types
        String name = "Jugendra";
        int day = 1;
        int totalDays = 182;
        double cpi = 6.4;
        char section = 'G';
        boolean placed = false;
        System.out.println("Name: " + name + " | Day " + day + " of " + totalDays);
        System.out.println("CPI: " + cpi + " | Section: " + section + " | Placed: " + placed);

        // 3. Arithmetic
        int a = 17, b = 5;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 4. String + number trap
        System.out.println("1 + 2 = " + 1 + 2);
        System.out.println("1 + 2 = " + (1 + 2));

        // TODO 1: 3 variables banao: tumhara city (String), LeetCode target 300 (int), height in metres (double). Ek line mein print karo.

        String city = "Kasganj";
        int leetcode_target=300;
        double height = 1.65;
        System.out.println("city: "+  city+ " | leetcode_target: "+ leetcode_target + " | height: "+height);

        // TODO 2: 7 / 2 print karo. Pehle copy pe likho kya aayega, phir chalao. Phir aisa badlo ki 3.5 aaye, bina 3.5 likhe.
        
        System.out.println("7/2 = "+(7/2));
        System.out.println("7/2 = "+(7.0/2));
        // TODO 3: totalDays se weeks aur bache din nikalo (/ aur % se). Output aisa ho: 182 days = 26 weeks and 0 days
        System.out.println(totalDays+" days = "+(totalDays/7)+" weeks and "+(totalDays%7)+" days");

    }
}
