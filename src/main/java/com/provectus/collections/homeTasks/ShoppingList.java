package com.provectus.collections.homeTasks;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class ShoppingList {
    public static void main(String[] args) {
        Set<Product> finalShoppingList = new TreeSet<>();

        Product shoppingListTavriaV = new Product();
        shoppingListTavriaV.setName("Bread green");
        shoppingListTavriaV.setPrice(10);
        shoppingListTavriaV.setQuantity(1);


        Product shoppingListTavriaV2 = new Product();
        shoppingListTavriaV2.setName("Bread apple");
        shoppingListTavriaV2.setPrice(20);
        shoppingListTavriaV2.setQuantity(1);

        System.out.println(shoppingListTavriaV);

        Product shoppingListKopeyka = new Product();
        shoppingListKopeyka.setName("Oil");
        shoppingListKopeyka.setPrice(20);
        shoppingListKopeyka.setQuantity(1);

        System.out.println(shoppingListKopeyka);

        Product shoppingListObjora = new Product();
        shoppingListObjora.setName("Eggs");
        shoppingListObjora.setPrice(30);
        shoppingListObjora.setQuantity(2);

        System.out.println(shoppingListObjora);

        finalShoppingList.add(shoppingListTavriaV);
        finalShoppingList.add(shoppingListKopeyka);
        finalShoppingList.add(shoppingListObjora);

        finalShoppingList.stream().sorted();
        System.out.println(finalShoppingList);

//        System.out.println("shoppingListTavriaV".compareToIgnoreCase("shoppingListKopeyka"));

    }
}
