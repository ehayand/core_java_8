package chapter04.section03;

/**
 * Created by ehay@naver.com on 2018-08-21
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public enum Operation {
    ADD{
        public int eval(int arg1, int arg2) { return arg1 + arg2; }
    },
    SUBTRACK{
        public int eval(int arg1, int arg2) { return arg1 - arg2; }
    },
    MULTIPLY{
        public int eval(int arg1, int arg2) { return arg1 * arg2; }
    },
    DIVIDE{
        public int eval(int arg1, int arg2) { return arg1 / arg2; }
    };

    public abstract int eval(int arg1, int arg2);
}
