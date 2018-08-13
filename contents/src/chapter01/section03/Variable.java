package chapter01.section03;

import java.util.Random;

/**
 * Created by ehay@naver.com on 2018-07-16
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Variable {
    public static void main(String[] args) {
        // 1. Variable declaration
        int total = 0, count;
        // Multiple variables of the same type can be declared as one statement.
        // 'total' is an initialized integer, and 'count' is an uninitialized integer.

        Random generator = new Random();
        // The first Random is the type of the variable 'generator'.
        // The second 'Random' creates an Object of the Class as a 'new' expression.

        // 2. Variale name
        // Usually, the names of Vriables and Methods begin with a lowercase letter,
        // and the name of a Class begins with a capital letter.
        // Also, the majority prefer 'CamelCase'. (ex countOfInvalidInputs)
        // 'CamelCase' is the capitalization of the first letter of each word.

        // 3. Initialize variables
        // When declare a variable in a method, must initialize it before using it.
        // Using an uninitialized variable causes an error when compiling.
        // Inside a method, can declare a variable anywhere.
        // Java considers it a good idea to slow down variable declarations until just before use them.

        // 4. Constant
        // The 'final' keyword is used for values that can not be changed once assigned.
        final int DAYS_PER_WEEK = 7;
        // Usually, constant names follow the convention of declaring them in uppercase.
        // Can also declare a constant outside a method by adding the keyword 'static'.
        boolean leapYear = false;
        final int DAYS_IN_FEBRUARY;

        if(leapYear) DAYS_IN_FEBRUARY = 29;
        else DAYS_IN_FEBRUARY = 28;
        // Initialization of the 'final' variable may be done later.
    }
}
