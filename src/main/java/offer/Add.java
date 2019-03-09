package offer;

/**
 * @author qiaoying
 * @date 2019-03-09 15:21
 */
public class Add {
    public int Add(int num1,int num2) {
        int sum = 0;
        int carry = 0;
        do {
            sum = num1 ^ num2;
            carry = num1 & num2;
            if (carry != 0) {
                carry = carry << 1;
            }
            num1 = sum;
            num2 = carry;
        }while (carry != 0);
        return sum;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        Add add = new Add();
        System.out.println(add.Add(num1, num2));
    }
}
