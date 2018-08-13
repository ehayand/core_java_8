package chapter03.section01;

/**
 * Created by ehay@naver.com on 2018-08-13
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class TestMain {
    public static void main(String[] args) {

        SquareSequence squares = new SquareSequence();
        double avg = average(squares, 100);

        System.out.println(avg);

        IntSequence digits = new DigitSequence(1729);
//        while(digits.hasNext()){
//            System.out.println(digits.next());
//        }
        avg = average(digits, 100);

        System.out.println(avg);

        IntSequence sequence = new DigitSequence(1923);
        DigitSequence digits2 = (DigitSequence) sequence;
        System.out.println(digits2.rest());

        // String digitString = (String) sequence;  classCastExcepion!
        // RandomSequence randoms = (RandomSequence) sequence;  not sure!

        if(sequence instanceof  DigitSequence){
            DigitSequence digits3 = (DigitSequence) sequence;
        }

    }

    public static double average(IntSequence sequence, int n) {
        int count = 0;
        double sum = 0;
        while (sequence.hasNext() && count < n) {
            count++;
            sum += sequence.next();
        }
        return count == 0 ? 0 : sum / count;
    }
}
