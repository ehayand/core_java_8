package chapter03.section03;

/**
 * Created by ehay@naver.com on 2018-08-14
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class HelloTask implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<1000; i++) System.out.println("Hello, World!");
    }
}
