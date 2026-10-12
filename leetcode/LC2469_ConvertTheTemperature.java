// LeetCode 2469. Convert the Temperature (Easy)
// Link: https://leetcode.com/problems/convert-the-temperature/
// Question: Celsius (double) diya hai. Kelvin (celsius + 273.15) aur Fahrenheit (celsius * 1.80 + 32.00) ka array return karo.
// Mera approach: Celsius se Kelvin (+273.15) aur Fahrenheit (*1.80 + 32.00) nikale, dono ko array mein return kiya.
// Time: O(1)  Space: O(1)

// ---- neeche apna LeetCode code paste karo ----
class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius+273.15;
        double fahrenheit = celsius*1.80+ 32.00;
        return new double[]{kelvin,fahrenheit};
    }
}
