package offer;



/**
 * @author qiaoying
 * @date 2019-03-03 15:38
 */
public class ReverseSentence {
    public String ReverseSentence(String str) {
        if (str == null ){
            return null;
        }
        if (str.trim().equals(" ")) {
            return str;
        }
        String[] array = str.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            builder.append(array[i] + " ");


        }

        return builder.toString().trim();
    }


    public static void main(String[] args) {
        String string = " ";
        ReverseSentence reverseSentence = new ReverseSentence();
        System.out.println(reverseSentence.ReverseSentence(string));
    }
}
