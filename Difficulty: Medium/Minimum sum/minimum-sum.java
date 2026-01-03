
class Solution {
    String minSum(int[] arr) {

        Arrays.sort(arr);

        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                num1.append(arr[i]);
            else
                num2.append(arr[i]);
        }

        String sum = addStrings(num1.toString(), num2.toString());

        int idx = 0;
        while (idx < sum.length() - 1 && sum.charAt(idx) == '0') {
            idx++;
        }

        return sum.substring(idx);
    }

    String addStrings(String s1, String s2) {
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;

        StringBuilder res = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) sum += s1.charAt(i--) - '0';
            if (j >= 0) sum += s2.charAt(j--) - '0';

            res.append(sum % 10);
            carry = sum / 10;
        }

        return res.reverse().toString();
    }
}
