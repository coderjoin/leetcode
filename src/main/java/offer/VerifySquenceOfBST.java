package offer;

/**
 * @author qiaoying
 * @date 2019-03-02 14:34
 */
public class VerifySquenceOfBST {
    public  boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length == 0) {
            return false;
        }
        return verify(sequence, 0, sequence.length - 1);
    }

    public boolean verify(int[] sequence, int begin, int end) {
        if (begin == end) {
            return true;
        }
        int rootValue = sequence[end];
        int leftBegin = -1;
        int leftEnd = -1;
        int rightBegin = -1;
        int rightEnd = -1;
        if (sequence[begin] < rootValue) {
            leftBegin = begin;
        }
        for (int i = begin; i < end; i++) {
            if (sequence[i] < rootValue) {
                leftEnd = i;
            } else {
                if (rightBegin == -1) {
                    rightBegin = i;
                }
                rightEnd = i;
            }
        }

        if (rightBegin < leftEnd && rightBegin != -1) {
            return false;
        }
        return verify(sequence, leftBegin,leftEnd) && verify(sequence, rightBegin, rightEnd);
    }

    public static void main(String[] args) {
        int[] a = {0,1,3,5,6};
        VerifySquenceOfBST verifySquenceOfBST = new VerifySquenceOfBST();
        System.out.println(verifySquenceOfBST.VerifySquenceOfBST(a));
    }
}
