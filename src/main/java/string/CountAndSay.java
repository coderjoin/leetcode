package string;



public class CountAndSay {
    public static String countAndSay(int n) {
        if (n <= 0) return "-1";

        String result = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder builder = new StringBuilder();
            int index = 0;
            while (index < result.length()) {
                // 记录值
                char val = result.charAt(index);
                // 记录连续位数
                int count = 0;

                // 查找连续位数，碰到不相同的数字时停止。
                while (index < result.length() && result.charAt(index) == val) {
                    index++;
                    count++;
                }

                // 追加连续位数到结果中
                builder.append(String.valueOf(count));
                // 追加连续位数的值到结果中
                builder.append(val);
            }
            result = builder.toString();
        }
        return result;
    }

    public static void main(String[] args){
        int n = 5;
        String result = countAndSay(n);
        System.out.print(result);
    }
}
