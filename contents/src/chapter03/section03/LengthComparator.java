package chapter03.section03;

import java.util.Comparator;
/**
 * Created by ehay@naver.com on 2018-08-14
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class LengthComparator implements Comparator<String>{
    @Override
    public int compare(String first, String second) {
        return first.length() - second.length();
    }
}
