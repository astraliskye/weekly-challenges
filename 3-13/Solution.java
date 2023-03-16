public class Solution {
    public static void main(String[] args) {
        System.out.println(convert(5));
        System.out.println(convert(3));
        System.out.println(convert(2));
    }

    public static int convert(int minute) {
        return minute * 60;
    }
}