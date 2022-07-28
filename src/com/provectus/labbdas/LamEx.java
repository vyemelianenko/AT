package com.provectus.labbdas;

import java.util.Locale;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class LamEx {
    public static void main(String[] args) {
//        @Override
//        public void method1() {
//            System.out.println("method1");
//        }
        //            @Override
//            public String method2(int num) {
//                return String.valueOf(num);
//            }
        //якщо 1 параметр, моно скобки не використовувати
        //
    Iface iface = (s, s2) ->
//        {
//            String params = s + "; " + s2;
//            return params;
//        };
        {
            String params = s + ": " + s2;
            System.out.println("method1,params : " + params);
        };

        iface.method1("param1", "param2");

        Predicate<String > predicate = s -> s.contains("test");
        System.out.println(predicate.test("java"));
        System.out.println(predicate.test("java test"));
        System.out.println(predicate.test("java auto"));

       Supplier<Integer> supplier = () -> new Random().nextInt(100);//параетри не приймає
        System.out.println(supplier.get());
        System.out.println(supplier.get());

        Consumer<String> consumer = p -> System.out.println(p.toUpperCase());
        consumer.accept("java");
        consumer.accept("test");

        Function<String ,Integer> function = (s) -> Integer.valueOf(s);
        Function<String ,Integer> function2 = Integer::valueOf;
        Function<String ,Integer> function3 = TextUtil::convertTextToint;
//        Function<String ,Integer> function4 = TextUtil::convertTexttoInt2;

        System.out.println(function.apply("6"));
        System.out.println(function.apply("11"));
        System.out.println(function.apply("111"));

        Function<Integer, String> function1 = i -> "this is string representation of number: " + i;
        System.out.println(function1.apply(6));

    }
}
