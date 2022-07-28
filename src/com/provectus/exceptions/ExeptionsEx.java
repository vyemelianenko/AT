package com.provectus.exceptions;

import java.io.FileNotFoundException;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class ExeptionsEx {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException, Exception {
        CheckedEx checkedEx = new CheckedEx();
//        checkedEx.getFileContent();
        

        try {
            checkedEx.getFileContent();
        } catch (InterruptedException interruptedException) {
            interruptedException.getStackTrace();
            System.out.println("Caught exception");
            throw new RuntimeException("WOW, this is runtime");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.getStackTrace();
            System.out.println("File not found");
//            throw new RuntimeException("WOW, this is runtime");
        } catch (Exception e) {
            System.out.println("Another Execption");
        } finally {
            //буде виконуватися в будь якому случаї після трая або кетча
            System.out.println("INSIDE FINALLY");
        }

//        checkedEx.getValueFromArray(5);


        if (false) {
            throw new ButtonNotFoundException("Can not find button new Item");
        }

        System.out.println("done");
    }
}
