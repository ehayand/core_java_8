package chapter01.section01;

import java.util.Random;

/**
 * Created by ehay@naver.com on 2018-07-15
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class HelloWorld {
    public static void main(String[] args) {
        // 1. HelloWorld
        System.out.println("Hello, World!");
        // <System.out> is Object. also it is Instance of <PrintStream> Class.

        // 3. Method call
        System.out.println("Hello, World!".length());
        // "Hello, World!" is Instance of <String> Class.
        // <String> Class has Method .length() to return length about <String> Object.

        System.out.println(new Random().nextInt());
        // <Random> Object is created with 'new' operator.
        // This call returns the next integer given by the random number generator.
        // <Random> Class is declared in the java.util package.
        // To use <Random> Class in program, need to add an import statement.

        Random generator = new Random();
        System.out.println(generator.nextInt());
        System.out.println(generator.nextInt());
        // To call a method more than once on an object, need to store the object in a variable.
    }
}