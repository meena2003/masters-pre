package fourthWeek.algorithm;

class Problem3 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(0));
    }
    public static boolean isPalindrome(int x) {
        if (x <= 0) {
            return false;
        }
        int halfLength = String.valueOf(x).length() / 2;
        int preNum = Integer.parseInt(String.valueOf(x).substring(0, halfLength));
        int reversedLastNum = 0;

        for (int i = 0; i < halfLength; i++) {
            reversedLastNum = reversedLastNum * 10 + x % 10;
            x /= 10;
        }

        return preNum == reversedLastNum;
    }
}
