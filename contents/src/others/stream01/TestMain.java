package others.stream01;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ehay@naver.com on 2018-09-06
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class TestMain {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer ans = null;

        for(Integer number : numbers){
            if(number > 3 && number < 9){
                Integer newNumber = number * 2;
                if(newNumber > 10){
                    ans = newNumber;
                    break;
                }
            }
        }

        System.out.println("Imperative : " + ans);

        //Lazy
        System.out.println("Functional : " +
            numbers.stream()
                    .filter(number -> number > 3)
                    .filter(number -> number < 9)
                    .map(number -> number * 2)
                    .filter(number -> number > 20) // null
                    .findFirst() // null check
        );
    }
}
