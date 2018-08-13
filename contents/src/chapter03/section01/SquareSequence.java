package chapter03.section01;

/**
 * Created by ehay@naver.com on 2018-08-13
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class SquareSequence implements IntSequence {
    private int i;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public int next() {
        i++;
        return i * i;
    }
}
