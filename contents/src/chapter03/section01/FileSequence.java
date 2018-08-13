package chapter03.section01;

/**
 * Created by ehay@naver.com on 2018-08-13
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class FileSequence implements IntSequence, Closeable{

    @Override
    public void close() {

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public int next() {
        return 0;
    }
}
