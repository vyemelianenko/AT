package com.provectus.session5;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class MethodEx {
    public static void main(String[] args) {


    }

    // access_mod return_type***  method_name (params Type1 ver1,Type2 ver2) {body_of_method}
    // *** = (if return need type , if not  return void)

    public void methodWithoutReturnType() {
    }

    public int methodWithReturnType() {

        return 0;//if contain some data , method should return with word return
    }


    public void someMethod() {
    }

    public void checkPageAvailablity() {
    }


    public int getFirstEvenNum(int[] num) {
        for (int i : num) {
            if (i % 2 == 0) {
                return 1;
            }
        }
        return -1;
    }

    public void methodWithParams(String name, int age, boolean isDeleted, String lastname) {
    }

    public void multiplyNum(int num) {
        num = num * 2;
    }


    public void multipluNum(int num1, int num2) {

    }

    public void muliplyNumInArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }

    public void methodWithVarArg(String... values) {
//        System.out.println(values[i]);
    }

    public void methodWithManyParams(int age, boolean isActive, String... names) {

    }


    public void multiplyNum(double d) {
        d = d * 5;
    }




}

