// TASK 01 - Java Fundamentals | 18 questions
// Sawal TaskSheet-01.pdf mein hain. Yahan sirf jawab likhna.
// Run: java "C:\Users\KISHAN\OneDrive\Desktop\DSA-JAVA\practice\Task01.java"

public class Task01 {

    public static void main(String[] args) {

        // ========== A. VARIABLES & DATA TYPES ==========

        String  shehar      = "";        // Q1
        int     umar        = 0;         // Q2
        double  pi          = 0;         // Q3
        char    pehlaAkshar = ' ';       // Q4
        boolean isStudent   = false;     // Q5


        // ========== B. ARITHMETIC & CASTING ==========

        int     jod     = 0;             // Q6
        int     bacha   = 0;             // Q7
        double  aadha   = 0;             // Q8
        int     kata    = 0;             // Q9
        double  average = 0;             // Q10


        // ========== C. STRINGS ==========

        String greeting = "";            // Q11

        String total = "";               // Q12

        String x = "java";
        String y = "ja" + "VA".toLowerCase();
        boolean same = false;            // Q13


        // ========== D. CONDITIONALS ==========

        int num = 17;
        String parity = "";              // Q14


        int a = 45, b = 72;
        int bada = 0;                    // Q15


        int marks = 75;
        String grade = "";               // Q16


        int age = 20;
        String ticket = "";              // Q17


        int n = 15;
        String fizz = "";                // Q18




        // ==================================================
        //  CHECKER — ISKE NEECHE KUCH MAT BADALNA
        // ==================================================
        boolean[] ok = new boolean[18];
        ok[0]  = shehar != null && !shehar.trim().isEmpty();
        ok[1]  = umar > 0;
        ok[2]  = Math.abs(pi - 3.14159) < 1e-9;
        ok[3]  = pehlaAkshar >= 'A' && pehlaAkshar <= 'Z';
        ok[4]  = isStudent;
        ok[5]  = jod == 25 + 17;
        ok[6]  = bacha == 47 % 5;
        ok[7]  = Math.abs(aadha - 3.5) < 1e-9;
        ok[8]  = kata == 9;
        ok[9]  = Math.abs(average - 6.5) < 1e-9;
        ok[10] = greeting != null && greeting.startsWith("Main ")
                 && greeting.contains(shehar) && greeting.contains(String.valueOf(umar));
        ok[11] = "total: 53".equals(total);
        ok[12] = same == x.equals(y);
        ok[13] = (num % 2 == 0) ? "even".equals(parity) : "odd".equals(parity);
        ok[14] = bada == Math.max(a, b);
        ok[15] = (marks >= 80 ? "A" : marks >= 60 ? "B" : marks >= 40 ? "C" : "F").equals(grade);
        ok[16] = (age >= 18 ? "adult" : "child").equals(ticket);
        String sahiFizz = (n % 15 == 0) ? "FizzBuzz" : (n % 3 == 0) ? "Fizz"
                        : (n % 5 == 0) ? "Buzz" : String.valueOf(n);
        ok[17] = sahiFizz.equals(fizz);

        Object[] got = { shehar, umar, pi, pehlaAkshar, isStudent, jod, bacha, aadha, kata,
                         average, greeting, total, same, parity, bada, grade, ticket, fizz };
        String[] hint = {
            "Q1  shehar = \"Kasganj\";",
            "Q2  umar = 19;   (bina quotes)",
            "Q3  pi = 3.14159;",
            "Q4  pehlaAkshar = 'J';   (single quotes, capital letter)",
            "Q5  isStudent = true;",
            "Q6  jod = 25 + 17;   (Java se karwao)",
            "Q7  bacha = 47 % 5;",
            "Q8  7 / 2 = 3 (int division). 7 / 2.0 likho -> 3.5",
            "Q9  kata = (int) 9.87;   -> 9 (kaat deta hai)",
            "Q10 (5 + 8) / 2 = 6 galat hai. / 2.0 karo -> 6.5",
            "Q11 \"Main \" + shehar + \" se hu aur meri umar \" + umar + \" saal hai\"",
            "Q12 \"total: \" + 5 + 3  ka natija exactly likho (String hai)",
            "Q13 same = x.equals(y);   ( == mat use karna )",
            "Q14 if (num % 2 == 0) parity = \"even\"; else parity = \"odd\";",
            "Q15 if (a > b) bada = a; else bada = b;",
            "Q16 if (marks>=80) ... else if (marks>=60) ... else if (marks>=40) ... else ...",
            "Q17 if (age >= 18) ticket = \"adult\"; else ticket = \"child\";",
            "Q18 n%15==0 -> FizzBuzz, warna n%3==0 -> Fizz, warna n%5==0 -> Buzz, warna number"
        };

        String[] sec = {"A. VARIABLES & DATA TYPES","B. ARITHMETIC & CASTING","C. STRINGS","D. CONDITIONALS"};
        int[] start = {0, 5, 10, 13};
        int score = 0, si = 0;

        System.out.println("\n=============== TASK 01 - RESULT ===============");
        for (int i = 0; i < ok.length; i++) {
            if (si < start.length && i == start[si]) System.out.println("\n  -- " + sec[si++] + " --");
            System.out.println("  Q" + (i + 1) + (i < 9 ? " " : "") + "  " + (ok[i] ? "[OK]  PASS" : "[X]   FAIL"));
            if (!ok[i]) {
                System.out.println("        " + hint[i]);
                System.out.println("        tumne diya: " + got[i]);
            }
            if (ok[i]) score++;
        }
        System.out.println("\n================================================");
        System.out.println("Score: " + score + " / 18");
        if (score == 18)      System.out.println("SAB SAHI! Ab bolo: Task 1 done - 18/18");
        else if (score >= 14) System.out.println("Bahut badhiya. Baaki " + (18 - score) + " theek karo.");
        else                  System.out.println("hint padho, theek karo, phir se chalao.");
    }
}
