package chapter03.section01;

/**
 * Created by ehay@naver.com on 2018-08-13
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class DigitSequence implements IntSequence {
    private int number;

    public DigitSequence(int number) {
        this.number = number;
    }

    @Override
    public boolean hasNext() {
        return number != 0;
    }

    @Override
    public int next() {
        int result = number % 10;
        number /= 10;
        return result;
    }

    public int rest() {
        return number;
    }
}
