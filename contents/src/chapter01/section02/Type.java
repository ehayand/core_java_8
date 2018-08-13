package chapter01.section02;

/**
 * Created by ehay@naver.com on 2018-07-15
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Type {
    public static void main(String[] args) {
        // 1. Integer Type
        byte byteInteger = 1;
        short shortInteger = 2;
        int intInteger = 4;
        long longInteger = 8;
        // There are four types of integers.
        // They each have different byte sizes of storage space.

        System.out.print(Byte.MIN_VALUE + "\t");
        System.out.println(Byte.MAX_VALUE);
        System.out.print(Short.MIN_VALUE + "\t\t");
        System.out.println(Short.MAX_VALUE);
        System.out.print(Integer.MIN_VALUE + "\t\t");
        System.out.println(Integer.MAX_VALUE);
        System.out.print(Long.MIN_VALUE + "\t\t");
        System.out.println(Long.MAX_VALUE);
        // Each expressible number

        // 2. Floating-point type
        float floatFloat = 4.0F;
        double doubleFloat = 8.0;
        // A float type number is suffixed with F, and a double type number is not.
        // A double-type literal can optionally have suffix D appended. (ex 8.0D)
        // Hexadecimal(0x1.0p-10) or Decimal (0x1.0e-10)

        doubleFloat = Double.POSITIVE_INFINITY;
        doubleFloat = Double.NEGATIVE_INFINITY;
        doubleFloat = Double.NaN;
        // Not a Number, NaN

        if(Double.isNaN(doubleFloat));
        // NaN check Method

        // 3. char type
        char charater = 'J';
        System.out.println(charater);
        // 'J' is a character literal with a value of 74(Hexadecimal 4A).
        // It is a code unit that represents the Unicode character 'U+004A'

        charater = '\u004A';
        System.out.println(charater);
        charater = '\u263A';
        System.out.println(charater);
        // Code units can also be expressed in hexadecimal using the prefix 'u'.

        // 4. boolean type
        boolean flag;
        flag = true;
        flag = false;
        if(flag);
        // boolean is not integer type in Java.
        // true is not integer 1 and false is not integer 0.
    }
}
