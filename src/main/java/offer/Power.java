package offer;

/**
 * @author qiaoying
 * @date 2019-02-24 19:25
 */
public class Power {
    public static double power(double base, int exponent) {

        if (exponent == 0) {
            if (equalZero(base) == true) {
                return 0;
            }
            return 1;
        }

        if (exponent > 0) {
            return complex(base, exponent);
        }

        if (equalZero(base)) {
            if (base > 0) {
                return Double.POSITIVE_INFINITY;
            }
            if (exponent % 2 == 0) {
                return Double.POSITIVE_INFINITY;
            }
            return Double.NEGATIVE_INFINITY;
        }


        return 1 / complex(base, exponent);
    }

    private static double complex(double base, int exponent) {
        double result = 1.0;
        if (exponent < 0) {
            exponent = 0 - exponent;
        }
        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }
        return result;
    }

    private static boolean equalZero(double base) {
        if (base > 0 && base < 0.00000001) {
            return true;
        }
        if (base < 0 && base > -0.00000001) {
            return true;
        }
        return false;
    }


    public static void main(String[] args){

        double base = 1.1;
        int exponent = 1;
        System.out.println(power(base,exponent));
    }
}
