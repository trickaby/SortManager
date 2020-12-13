package com.sparta.timin.exceptions;

public class IntegerNotEntered extends Exception {

    @Override
    public String getMessage() {
        return "Please enter an integer";
    }
}
