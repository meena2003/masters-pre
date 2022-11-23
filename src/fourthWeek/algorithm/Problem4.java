package fourthWeek.algorithm;

class Problem4 {
    public static void main(String[] args) {
        System.out.println(romanToInt("MDCXCV"));
    }

    private enum RomeNum {
        I(1), V(5), X(10), L(50), C(100), D(500), M(1000);
        private int value;

        private RomeNum(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static int romanToInt(String s) {
        int sum = 0;
        int length = s.length();
        int idx = 0;


        while (idx < length) {
            String nums = "";
            char ch = s.charAt(idx);

            if (idx + 1 < length) {
                nums = s.substring(idx, idx + 2);
            }

            if (nums.equals("IV")) {
                sum += 4;
                idx += 2;
                continue;
            } else if (nums.equals("IX")) {
                sum += 9;
                idx += 2;
                continue;
            } else if (nums.equals("XL")) {
                sum += 40;
                idx += 2;
                continue;
            } else if (nums.equals("XC")) {
                sum += 90;
                idx += 2;
                continue;
            } else if (nums.equals("CD")) {
                sum += 400;
                idx += 2;
                continue;
            } else if (nums.equals("CM")) {
                sum += 900;
                idx += 2;
                continue;
            }
            sum += RomeNum.valueOf(String.valueOf(ch)).getValue();
            idx++;
        }

        return sum;
    }
}

