package offer;

/**
 * @author qiaoying
 * @date 2019-02-07 10:17
 */
public class ReplaceSpace {

    public static String replaceSpace(StringBuffer str) {

        if (str == null){
            return null;
        }
        int fromIndex = 0;
        int index = 0;
        StringBuffer temp = new StringBuffer();
        while (index <= str.length()) {
            index = str.indexOf(" ", fromIndex);
            if (index >= 0) {
                temp.append(str.subSequence(fromIndex,index)).append("%20");
                index = index + 1;
                fromIndex = index;
            } else {
                temp.append(str.subSequence(fromIndex,str.length()));
                break;
            }
        }
        return temp.toString();

    }

    public static void main(String[] args){

        StringBuffer test = new StringBuffer();
        test.append("we");
        test.append(" ");
        test.append("are");
        test.append(" ");
        test.append("family");
        System.out.println(replaceSpace(test));
    }
}
