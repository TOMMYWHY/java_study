package com.j_se2.demo05_self_exception;

import java.util.Scanner;

public class Demo05RegisterException {
    static  String[] usernames = {"tommy","mark","allen"};
    public static void main(String[] args)/* throws RegisterException */{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter username.");
        String username = sc.next();
        checkUsername(username);

    }
    public static void checkUsername(String username)/*throws RegisterException*/{
        for (String name:usernames
             ) {
            if(name.equals(username)){
                //用户名存在，抛出异常
                try {
                    throw new RegisterException("the username registered~! ");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
        System.out.println("register sucessful");
    }
}
