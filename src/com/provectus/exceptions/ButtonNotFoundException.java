package com.provectus.exceptions;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class ButtonNotFoundException extends RuntimeException{
 public ButtonNotFoundException(String message) {
     super(message);
 }
}
