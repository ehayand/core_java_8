package chapter04.section03;

/**
 * Created by ehay@naver.com on 2018-08-21
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public enum Size {
    SMALL("S"),
    MEDIUM("M"),
    LARGE("L"),
    EXTRA_LARGE("XL");

    //약어 사용
    private String abbreviation;

    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
