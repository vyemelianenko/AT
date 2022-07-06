package com.provectus.session5;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class MethodAvailaility {
    public static void main(String[] args) {
        MethodEx m = new MethodEx();

        m.someMethod();
        m.checkPageAvailablity();
        m.methodWithParams("name", 4, true, "lastname");


        int a = 2;
        int[] array = {1, 2, 3};

        m.multiplyNum(a);
        m.multiplyNum(5.0);
        m.muliplyNumInArray(array);

//        System.out.println(a);
//        System.out.println(Arrays.toString(array));


        m.methodWithVarArg();
        m.methodWithVarArg("one");
        m.methodWithVarArg("two", "one", "three");

        UserPage userPage = new UserPage();
//        System.out.println(userPage.getUserInfo());

        AdminPage adminPage = new AdminPage();
//        System.out.println(adminPage.getUserInfo());
//
//        Construct construct = new Construct("value1");
//        System.out.println(construct.getValue());
//
//        Construct construct2 = new Construct("value2");
//        System.out.println(construct2.getValue());

        ChildClass2 childClass = new ChildClass2("some value");
        childClass.getChildValue();


    }
}
