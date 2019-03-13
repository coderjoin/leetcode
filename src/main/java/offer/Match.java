package offer;

/**
 * @author qiaoying
 * @date 2019-03-09 21:52
 */
public class Match {
    public boolean match(char[] str, char[] pattern)
    {
        if (str == null || pattern == null) {
            return false;
        }
        if (str.length == 0 && pattern.length == 0) {
            return true;
        }
        return matchCore(str, 0, pattern, 0);
    }

    public boolean matchCore(char[] str, int p1, char[] pattern, int p2) {
        if (p2 >= pattern.length) {
            return p1 >= str.length;
        }
        if (p1 >= str.length) {
            if (p2 + 1 < pattern.length && pattern[p2 + 1] == '*') {
                return matchCore(str, p1, pattern, p2 + 2);
            } else {
                return false;
            }
        }

        if (p2 + 1 < pattern.length && pattern[p2 + 1] == '*') {
            if (pattern[p2] == '.' || pattern[p2] == str[p1]) {
                return matchCore(str, p1 + 1, pattern, p2) ||
                        matchCore(str,p1,pattern,p2 + 2);
            } else {
                return matchCore(str, p1, pattern, p2 + 2);
            }
        } else {
            if (pattern[p2] == '.' || pattern[p2] == str[p1]) {
                return matchCore(str, p1 + 1, pattern, p2 + 1);
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        char[] str = {'a','a','a'};
        char[] pattern = {'a','b','*','a'};
        Match match = new Match();
        System.out.println(match.match(str,pattern));
    }


}
