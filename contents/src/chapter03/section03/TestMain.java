package chapter03.section03;

import java.util.Arrays;

/**
 * Created by ehay@naver.com on 2018-08-14
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class TestMain {
    public static void main(String[] args) {
        String[] friends = {"Peter", "Paul", "Mary"};
        for (String friend : friends) System.out.print(friend + " ");

        System.out.println();

        Arrays.sort(friends);
        for (String friend : friends) System.out.print(friend + " ");

        System.out.println();

        Arrays.sort(friends, new LengthComparator());
        for (String friend : friends) System.out.print(friend + " ");

        Runnable task = new HelloTask();
        Thread thread = new Thread(task);
        thread.start();

    }
}
