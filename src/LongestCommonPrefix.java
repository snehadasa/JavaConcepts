public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
//        for (String str : strs) {
//
//       }
        for (int i = 0; i < strs[0].length(); i++) {
            char letter = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[i].length() <= i || letter != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }

    public static void main(String[] args) {
        String []arr1 = {"flower", "flow", "flag"};
        String result1 = new LongestCommonPrefix().longestCommonPrefix(arr1);
        System.out.println(result1);

        String []arr2 = {"fl", "flow", "flag"};
        String result2 = new LongestCommonPrefix().longestCommonPrefix(arr2);
        System.out.println(result2);
    }
}
