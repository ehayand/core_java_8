package chapter01.section05;

/**
 * Created by ehay@naver.com on 2018-07-16
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class SequenceOfCharaters {

    public static void out(String str){
        System.out.println(str);
    }

    public static void main(String[] args){
        // 1.
        String location = "Java";
        String greeting = "Hello " + location;
        out(greeting);

        int age = 20;
        String output = (age + 1) + " years";
        out(output);

        String names = String.join(", ", "Peter", "Paul", "Mary");
        out(names);

        StringBuilder builder = new StringBuilder();
        String[] name = names.split(", ");
        for(int i=0; i<name.length; i++) builder.append(name[i] + " ");
        out(builder.toString());

        // 2.
        greeting = "Hello, World!";
        location = greeting.substring(7, 12);
        out(location);

        // 3.
        if(location.equals("World")) out("true");
        if("World".equals(location)) out("true");
        // The second equals is better than the first equals
        // The second way can to avoid NullPointerException.

        String middleName = null;
        if(middleName == null) out("null");

        if("WORLD".equalsIgnoreCase(location)) out("true");

        if(location.compareTo("world") < 0) out("front");
        else out("same or back");

        int n = 42;
        String str = Integer.toString(n); // "42"
        str = Integer.toString(n, 2); // "101010"

        n = Integer.parseInt(str); // 101,010
        n = Integer.parseInt(str, 2); // 42

        str = Double.toString(3.14); // "3.14"
        double x = Double.parseDouble(str); // 3.14

        char ch = str.charAt(0);
        int length = str.length();

        int codePoint = str.codePointAt(str.offsetByCodePoints(0, 0));
        length = str.codePointCount(0, str.length());

        System.out.println(codePoint);
        System.out.println(length);

        int[] codePoints = str.codePoints().toArray();

        for (int i=0; i<codePoints.length; i++) {
            System.out.print(codePoints[i]+" ");
        }
    }
}
