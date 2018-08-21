package chapter04.section03;

/**
 * Created by ehay@naver.com on 2018-08-21
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class TestMain {
    public static void main(String[] args){
        Size notMySize = Size.valueOf("SMALL");
        System.out.println(notMySize);

        if(notMySize == Size.SMALL) {  // '==' is better than 'equals()'
            notMySize = Size.MEDIUM;
            System.out.println(notMySize);
        }

        for(Size s : Size.values()) {
            System.out.print(s + " ");
        }
        System.out.println();

        Size[] allValues = Size.values();
        for(Size s : allValues){
            System.out.print(s + " ");
        }

        System.out.println("\n" + notMySize.getAbbreviation());

        Operation op = Operation.ADD;
        int result = op.eval(4, 5);
        System.out.println(result);
        op = Operation.SUBTRACK;
        result = op.eval(9, 5);
        System.out.println(result);

        Size size = Size.EXTRA_LARGE;

        switch (size){
            case SMALL:
                System.out.println(90);
                break;
            case MEDIUM:
                System.out.println(95);
                break;
            case LARGE:
                System.out.println(100);
                break;
            case EXTRA_LARGE:
                System.out.println(105);
                break;
        }

    }
}
