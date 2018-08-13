package chapter01.section06;

import java.io.Console;
import java.util.Scanner;

/**
 * Created by ehay@naver.com on 2018-08-13
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class InputOutput {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = in.nextLine();

//        String firstName = in.next();

        System.out.println("How old are you?");
        int age = in.nextInt();

//        if(in.hasNextInt()){
//            age = in.nextInt();
//        }

//        Console terminal = System.console();
//        String username = terminal.readLine("User name: ");
//        char[] passwd = terminal.readPassword("Password: ");
//
//        System.out.println(username + "   " + passwd);
    }

}
