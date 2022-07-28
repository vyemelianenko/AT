package com.provectus.nestedClasses.nonStaticClass;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class CatalogTest {
    public void catalogTest() {
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.setFilter("by name");

        CatalogPage.ProductTable table = catalogPage.new ProductTable();
        System.out.println(table.name);

        catalogPage.setFilter("by desc");
        table = catalogPage.new ProductTable();
        System.out.println(table.desc);
    }
}
