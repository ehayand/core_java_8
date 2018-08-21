package chapter04.section03;

/**
 * Created by ehay@naver.com on 2018-08-21
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public enum Modifier {
    PUBLIC, PRIVATE, PROTECTED, STATIC, FINAL, ABSTRACT;
    private int mask;

    //static initlalizer block
    static{
        int maskBit = 1;
        for(Modifier m : Modifier.values()){
            m.mask = maskBit;
            maskBit <<= 1;
        }
    }
}
