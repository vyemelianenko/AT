package com.provectus.session3;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class WhileLoop {
    public static void main(String[] args) {

        boolean flag = true;
        int attempt = 0;

        while (flag) {
            System.out.println(attempt++);

            if (attempt > 5) {
                flag = false;
            }
        }

        System.out.println("done While");
        flag = false;
        do {
            System.out.println(attempt++);
        } while(flag);


        System.out.println("done Do While");
    }

}
