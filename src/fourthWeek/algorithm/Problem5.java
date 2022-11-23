package fourthWeek.algorithm;

class Problem5 {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int smallestLength = strs[0].length();

        for (int i = 1; i < strs.length; i++) {
            if (smallestLength > strs[i].length()) {
                smallestLength = strs[i].length();
            }
        }

        outer:
        for (int i = 0; i < smallestLength; i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (ch != strs[j].charAt(i)) {
                    break outer;
                }
            }
            sb.append(strs[0].charAt(i));
        }

        return String.valueOf(sb);
    }
}
